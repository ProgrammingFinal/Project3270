package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public abstract class Start extends Application {

	public static void main(String[] args){
		new SplashScreen();
		Application.launch(args);
	


	}

	public Start(Stage primaryStage) {
		AnchorPane root = new AnchorPane();
	Scene scene = new Scene(root, 300, 250, Color.TRANSPARENT);
    primaryStage.initStyle(StageStyle.TRANSPARENT);
    primaryStage.setScene(scene);
    primaryStage.show();
    root.setStyle("-fx-background-color: transparent;"); 
}


    
   

    
}