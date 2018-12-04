package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FlightCreation extends Application implements EventHandler<ActionEvent> {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Flight Creation");
		AnchorPane anchor = new AnchorPane();
		anchor.setPadding(new Insets(20, 20, 20, 20));

		// text box for title
		Text title = new Text("Add Flight");
		title.setLayoutX(250);
		title.setLayoutY(50);

		// text boxes for flight attributes
		Text airline = new Text("Airline");
		airline.setLayoutX(100);
		airline.setLayoutY(90);

		Text flightNumber = new Text("Flight Number");
		flightNumber.setLayoutX(100);
		flightNumber.setLayoutY(125);

		Text originCity = new Text("Origin City");
		originCity.setLayoutX(100);
		originCity.setLayoutY(160);

		Text destinationCity = new Text("Destination City");
		destinationCity.setLayoutX(100);
		destinationCity.setLayoutY(190);

		Text departureDate = new Text("Departure Date");
		departureDate.setLayoutX(100);
		departureDate.setLayoutY(230);

		Text departureTime = new Text("Departure Time");
		departureTime.setLayoutX(100);
		departureTime.setLayoutY(266);

		Text arrivalDate = new Text("Arrival Date");
		arrivalDate.setLayoutX(100);
		arrivalDate.setLayoutY(299);

		Text arrivalTime = new Text("Arrival Time");
		arrivalTime.setLayoutX(100);
		arrivalTime.setLayoutY(333);

		Text capacity = new Text("Capacity");
		capacity.setLayoutX(100);
		capacity.setLayoutY(366);

		// text fields for flight attributes
		TextField airlineTxtField = new TextField();
		airlineTxtField.setLayoutX(200);
		airlineTxtField.setLayoutY(70);
		airlineTxtField.setPromptText("Airline");

		TextField flightNumberTxtField = new TextField();
		flightNumberTxtField.setLayoutX(200);
		flightNumberTxtField.setLayoutY(105);
		flightNumberTxtField.setPromptText("Flight Number");

		TextField originCityTxtField = new TextField();
		originCityTxtField.setLayoutX(200);
		originCityTxtField.setLayoutY(140);
		originCityTxtField.setPromptText("Origin City");

		TextField destinationCityTxtField = new TextField();
		destinationCityTxtField.setLayoutX(200);
		destinationCityTxtField.setLayoutY(175);
		destinationCityTxtField.setPromptText("Destination City");

		TextField departureDateTxtField = new TextField();
		departureDateTxtField.setLayoutX(200);
		departureDateTxtField.setLayoutY(210);
		departureDateTxtField.setPromptText("YYYY-MM-DD");

		TextField departureTimeTxtField = new TextField();
		departureTimeTxtField.setLayoutX(200);
		departureTimeTxtField.setLayoutY(245);
		departureTimeTxtField.setPromptText("HH:MM:SS");

		TextField arrivalDateTxtField = new TextField();
		arrivalDateTxtField.setLayoutX(200);
		arrivalDateTxtField.setLayoutY(280);
		arrivalDateTxtField.setPromptText("YYYY-MM-DD");

		TextField arrivalTimeTxtField = new TextField();
		arrivalTimeTxtField.setLayoutX(200);
		arrivalTimeTxtField.setLayoutY(315);
		arrivalTimeTxtField.setPromptText("HH:MM:SS");

		TextField capacityTxtField = new TextField();
		capacityTxtField.setLayoutX(200);
		capacityTxtField.setLayoutY(350);
		capacityTxtField.setPromptText("Capacity");

		Button returnHome = new Button("Return to main Page");
		returnHome.setLayoutX(210);
		returnHome.setLayoutY(450);
		returnHome.setOnAction(e -> {
			Main home = new Main();
			try {
				home.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		Button create = new Button("Create Flight");
		create.setLayoutX(230);
		create.setLayoutY(400);
		create.setOnAction(e -> {
			java.sql.Timestamp departure = java.sql.Timestamp
					.valueOf(departureDateTxtField.getText().concat(" " + departureTimeTxtField.getText()));
			java.sql.Timestamp arrival = java.sql.Timestamp
					.valueOf(arrivalDateTxtField.getText().concat(" " + arrivalTimeTxtField.getText()));

			if (schedulingCheck(departure, arrival) == 0) {

				try {

					Connection myConn;
					myConn = DriverManager.getConnection(
							"jdbc:mysql://127.0.0.1:3306/demo", "root",
							"programmingfinal1");
					String sqlFightCheck = "select * From `flights`.`flight` where number = '"
							+ flightNumberTxtField.getText() + "'";

					String sqlFlightCreate = "INSERT INTO `flights`.`flight`(`airline`,`number`,`origin_city`,`destination_city`,`departure_date`,"
							+ "`departure_time`,`arrival_date`,`arrival_time`,`capacity`,`seats_available`) VALUES('"
							+ airlineTxtField.getText() + "', '" + flightNumberTxtField.getText() + "', '"
							+ originCityTxtField.getText() + "', '" + destinationCityTxtField.getText() + "' , '"
							+ departureDateTxtField.getText() + "', '" + departureTimeTxtField.getText() + "', '"
							+ arrivalDateTxtField.getText() + "', '" + arrivalTimeTxtField.getText() + "', '"
							+ capacityTxtField.getText() +  "', '" + capacityTxtField.getText() + "')";

					Statement myStat = myConn.createStatement();

					// execute a query
					;
					ResultSet myRs;
					myRs = myStat.executeQuery(sqlFightCheck);
					int count = 0;
					while (myRs.next()) {
						count += 1;
					}
					if (count == 0) {
						myStat.executeUpdate(sqlFlightCreate);
						AlertBox.display("Success", "Flight Successfully Added!");

					} else {
						AlertBox.display("Error",
								"Flight number " + flightNumberTxtField.getText() + " already exists.");
					}

				} catch (SQLException exc) {
					System.out.println(exc.getMessage());
				}
			}

			else {
				AlertBox.display("Error", "Error: an arrival cannot be before a departure");
			}
		});

		anchor.getChildren().addAll(title, airline, flightNumber, originCity, destinationCity, departureDate, departureTime,
				arrivalDate, arrivalTime, capacity, airlineTxtField, flightNumberTxtField, originCityTxtField,
				destinationCityTxtField, departureDateTxtField, departureTimeTxtField, arrivalDateTxtField,
				arrivalTimeTxtField, capacityTxtField, create, returnHome);

		Scene scene = new Scene(anchor, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
		primaryStage.setMaximized(false);
		primaryStage.centerOnScreen();
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public int schedulingCheck(Timestamp d, Timestamp a) {

		if (d.compareTo(a) >= 0) {
			return 1;
		} else {
			return 0;
		}

	}

}