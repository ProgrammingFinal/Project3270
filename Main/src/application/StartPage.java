package application;
	
import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class StartPage extends Application {
	
	Button button;
	Button button2;
	
	/* @Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} */
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Airline Reservation System");
		
		button = new Button();
		button.setText("Start");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Good click!");
			}
			
		});
		
		
		
		
		StackPane layout = new StackPane();
		layout.getChildren().addAll(button);
		
		Scene scene = new Scene (layout, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}

