package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class flightTable extends Application {

    Stage window;
    TableView<Flight> table;
    TextField nameInput, priceInput, quantityInput;

    
    public static void main(String[] args) {
        launch(args);
    }

    @SuppressWarnings("unchecked")
	@Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Airline Reservation System");

        //Name column
        TableColumn<Flight, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Flight, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<Flight, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        
        //Name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        //Price input
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);
        
        //Quantity input
        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);

        //Add Button
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        //Delete Button
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());

        // Creates new HBox for nameInput, priceInput quantityInput, addButton, and deleteButton
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);


        table = new TableView<>();
        table.setItems(getFlight());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }
    
    //Add button clicked
    public void addButtonClicked(){
        Flight flight = new Flight();
        flight.setName(nameInput.getText());
        flight.setPrice(Double.parseDouble(priceInput.getText()));
        flight.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(flight);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    //Delete button clicked
    public void deleteButtonClicked(){
        ObservableList<Flight> flightSelected, allFlights;
        allFlights = table.getItems();
        flightSelected = table.getSelectionModel().getSelectedItems();

        flightSelected.forEach(allFlights::remove);
    }


    
    //Get all of the flights
    public ObservableList<Flight> getFlight(){
        ObservableList<Flight> flights = FXCollections.observableArrayList();
        flights.add(new 	Flight("Atlanta - Sacremento", 459.00, 20));
        flights.add(new Flight("Los Angeles - New York", 425.49, 198));
        flights.add(new Flight("New York - Chicago", 399.00, 74));
        flights.add(new Flight("San Francisco - Colorado", 319.99, 12));
        flights.add(new Flight("Charlotte - Dallas", 249.49, 856));
        return flights;
    }


}