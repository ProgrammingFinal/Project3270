package application;

import java.sql.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Register extends Application implements EventHandler<ActionEvent> {
	// create text field for first name
		TextField tfName = new TextField();
		// create text field for last name
		TextField tlName = new TextField();
		// create text field for address
		TextField tAddress = new TextField();
		// create text field for zip code
		TextField tZip = new TextField();
		// create text field for state
		TextField tState = new TextField();
		// create text field for username
		TextField tUserName = new TextField();
		// create text field for email
		TextField tEmail = new TextField();
		// create text field for SSN
		TextField tSSN = new TextField();
		// create text field for security question
		TextField tSecurityQ = new TextField();
		// create text field for security answer
		TextField tSecurityA = new TextField();
		// create password field for password
		PasswordField tPassword = new PasswordField();
		PasswordField tConfirm = new PasswordField();
		// create buttons
		Button button = new Button();
		Button button0 = new Button();
		// create title label
		Label Title = new Label();
		

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	/**
	 * Initialize the contents of the frame.
	 */

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set title of stage
		primaryStage.setTitle("Register");
		//set stage resizability
		primaryStage.setResizable(false);
		// create new anchor pane
		AnchorPane anchor = new AnchorPane();
		// set padding of anchor pane
		anchor.setPadding(new Insets(10, 10, 10, 10));

		// create first name label
		Label firstNameLbl = new Label();
		//set x-coordinate of first name label
		firstNameLbl.setLayoutX(170.0);
		firstNameLbl.setLayoutY(81.0);
		firstNameLbl.setText("First Name");
		firstNameLbl.setFont(new Font(20.0));

		// create last name label
		Label lastNameLbl = new Label();
		//set x-coordinate of last name label
		lastNameLbl.setLayoutX(171.0);
		lastNameLbl.setLayoutY(114.0);
		lastNameLbl.setText("Last Name");
		lastNameLbl.setFont(new Font(20.0));

		// create address label
		Label addressLbl = new Label();
		//set x-coordinate of address label
		addressLbl.setLayoutX(194.0);
		addressLbl.setLayoutY(149.0);
		addressLbl.setText("Address");
		addressLbl.setFont(new Font(20.0));

		// create zip code label
		Label zipLbl = new Label();
		//set x-coordinate of zip code label
		zipLbl.setLayoutX(184.0);
		zipLbl.setLayoutY(184.0);
		zipLbl.setText("Zip Code");
		zipLbl.setFont(new Font(20.0));

		// create state label
		Label stateLbl = new Label();
		//set x-coordinate of state label
		stateLbl.setLayoutX(218.0);
		stateLbl.setLayoutY(221.0);
		stateLbl.setText("State");
		stateLbl.setFont(new Font(20.0));
		
		// create username label
		Label userLbl = new Label();
		//set x-coordinate of user label
		userLbl.setLayoutX(174.0);
		userLbl.setLayoutY(256.0);
		userLbl.setText("Username");
		userLbl.setFont(new Font(20.0));

		// create password label
		Label passLbl = new Label();
		passLbl.setLayoutX(177.0);
		passLbl.setLayoutY(287.0);
		passLbl.setText("Password");
		passLbl.setFont(new Font(20.0));

		//create password confirm label
		Label pconfirmPassLbl = new Label();
		pconfirmPassLbl.setLayoutX(103.0);
		pconfirmPassLbl.setLayoutY(329.0);
		pconfirmPassLbl.setText("Confirm Password");
		pconfirmPassLbl.setFont(new Font(20.0));

		//create email label
		Label emailLbl = new Label();
		emailLbl.setLayoutX(217.0);
		emailLbl.setLayoutY(362.0);
		emailLbl.setText("Email");
		emailLbl.setFont(new Font(20.0));

		// create SSN label
		Label ssnLbl = new Label();
		ssnLbl.setLayoutX(220.0);
		ssnLbl.setLayoutY(400.0);
		ssnLbl.setText("SSN");
		ssnLbl.setFont(new Font(20.0));

		// create security question label
		Label secQLbl = new Label();
		secQLbl.setLayoutX(105.0);
		secQLbl.setLayoutY(434.0);
		secQLbl.setText("Security Question");
		secQLbl.setFont(new Font(20.0));

		// create security answer label
		Label secALbl = new Label();
		secALbl.setLayoutX(124.0);
		secALbl.setLayoutY(472.0);
		secALbl.setText("Security Answer");
		secALbl.setFont(new Font(20.0));
		
		
		
		
		

		tfName.setLayoutX(274.0);
		tfName.setLayoutY(83.0);
		tfName.setPromptText("First Name");

		tlName.setLayoutX(274.0);
		tlName.setLayoutY(116.0);
		tlName.setPromptText("Last Name");

		tAddress.setLayoutX(274.0);
		tAddress.setLayoutY(151.0);
		tAddress.setPromptText("Address");

		tZip.setLayoutX(274.0);
		tZip.setLayoutY(186.0);
		tZip.setPromptText("#####");

		tState.setLayoutX(274.0);
		tState.setLayoutY(223.0);
		tState.setPromptText("State");

		tUserName.setLayoutX(274.0);
		tUserName.setLayoutY(258.0);
		tUserName.setPromptText("Username");

		tEmail.setLayoutX(274.0);
		tEmail.setLayoutY(364.0);
		tEmail.setPromptText("Example@example.com");

		tSSN.setLayoutX(274.0);
		tSSN.setLayoutY(402.0);
		tSSN.setPromptText("###-##-####");

		tSecurityQ.setLayoutX(274.0);
		tSecurityQ.setLayoutY(436.0);
		tSecurityQ.setPromptText("Security Question");

		tSecurityA.setLayoutX(274.0);
		tSecurityA.setLayoutY(474.0);
		tSecurityA.setPromptText("Security Answer");

		tPassword.setLayoutX(274.0);
		tPassword.setLayoutY(290.0);
		tPassword.setPromptText("Password");

		tConfirm.setLayoutX(274.0);
		tConfirm.setLayoutY(329.0);
		tConfirm.setPromptText("Confirm Password");

		button.setLayoutX(284.0);
		button.setLayoutY(534.0);
		button.setMnemonicParsing(false);
		button.setPrefHeight(25.0);
		button.setPrefWidth(105.0);
		button.setText("Register");
		button.setOnAction(e -> {
			
			if (tfName.getText().isEmpty() || tlName.getText().isEmpty() || tUserName.getText().isEmpty()
					|| tPassword.getText().isEmpty() || tEmail.getText().isEmpty() || tSSN.getText().isEmpty()
					|| tSecurityQ.getText().isEmpty() || tSecurityA.getText().isEmpty()) {
				AlertBox.display("Error!", "Please fill out all the required field and submit.");
				
			} else {
				if (tPassword.getText().equals((tConfirm.getText())) == false) {
					AlertBox.display("Error", "Password and Confirm password do not match.");
				} else {
					String sql = "INSERT INTO `flights`.`users`"
							+ "(`firstName`,`lastName`,`address`,`zipcode`,`state`,`username`,`password`,`email`,"
							+ "`ssn`,`security_question`,`security_answer`,`isAdmin`)VALUES " + "('" + tfName.getText()
							+ "', '" + tlName.getText() + "', '" + tAddress.getText() + "', '" + tZip.getText() + "', '"
							+ tState.getText() + "', '" + tUserName.getText() + "', '" + tPassword.getText() + "', '"
							+ tEmail.getText() + "', '" + tSSN.getText() + "', '" + tSecurityQ.getText() + "', '"
							+ tSecurityA.getText() + "', '0')";

					try {
						Connection myConn = DriverManager.getConnection(
								"jdbc:mysql://127.0.0.1:3306/demo", "root",
								"programmingfinal1");
						// create a statement
						Statement myStat = myConn.createStatement();
						myStat.executeUpdate(sql);

						AlertBox.display("Sucess", "A new user inserted successfully.");
						

						Thread.sleep(3000);

						LogIn loginPage = new LogIn();
						try {
							loginPage.start(primaryStage);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (SQLException | InterruptedException e1) {
						AlertBox.display("Error", "A new user insert failed. \nThe user name " + tUserName.getText()
								+ " is not available.");
						
						System.out.println(e1.getMessage());
					}

				}
			}
		});

		button0.setLayoutX(154.0);
		button0.setLayoutY(534.0);
		button0.setMnemonicParsing(false);
		button0.setText("Return To Log In");
		button0.setOnAction(e -> {
			LogIn loginPage = new LogIn();
			try {
				loginPage.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		Title.setLayoutX(204.0);
		Title.setLayoutY(14.0);
		Title.setText("Register User");
		Title.setFont(new Font(24.0));

		anchor.getChildren().addAll(firstNameLbl,lastNameLbl,addressLbl,zipLbl, stateLbl,userLbl,passLbl,
				pconfirmPassLbl, emailLbl,ssnLbl,secQLbl,secALbl,tfName, tlName, tAddress, tZip, tState,tUserName,
				tEmail, tSSN, tSecurityQ, tSecurityA, tPassword, tConfirm, button, button0, Title);
		
		
		Scene scene = new Scene(anchor, 613, 612);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.centerOnScreen();
	}

}