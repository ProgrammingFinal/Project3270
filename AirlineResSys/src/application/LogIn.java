package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LogIn extends Application implements EventHandler<ActionEvent> {
	// declare private data field variables
	private static String user = "";
	private static String password = "";

	public LogIn(){

	}

	//User getter
	public static String getUser() {
		return user;
	}

	//User setter
	public static void setUser(String user) {
		LogIn.user = user;
	}

	//Password getter
	public static String getPassword() {
		return password;
	}

	//Password setter
	public static void setPassword(String password) {
		LogIn.password = password;
	}

	// image getter
	public Image getImg() {
		return img;
	}

	// image setter
	public void setImg(Image img) {
		this.img = img;
	}


	// sets scene
	public static Scene scene;
	private Image img;


    // main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch application
		Application.launch(args);

	}

	// starts log in stage
	public void start(Stage primaryStage) throws Exception {

		//sets stage title to "log in"
		primaryStage.setTitle("Log In");
		// sets whether or not the stage is resizable by the user: (no)
		primaryStage.setResizable(false);
		// create new anchor pane
		AnchorPane anchor = new AnchorPane();
		// set padding of anchor pane to 10 pixels on the top, right, bottom, and left
		anchor.setPadding(new Insets(10, 10, 10, 10));

		// login label
		Label loginLabel = new Label("Please enter your username and password:");
		// set alignment of login label to center
		loginLabel.setAlignment(javafx.geometry.Pos.CENTER);
		// set x-coordinate of login label
		loginLabel.setLayoutX(50.0);
		// set y-coordinate of login label
		loginLabel.setLayoutY(50.0);
		//
		loginLabel.setPrefHeight(25.0);
		loginLabel.setPrefWidth(450.0);
		loginLabel.setText("Please enter your username and password:");
		loginLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
		loginLabel.setFont(new Font(20.0));

		Label usernameLabel = new Label("Username:");
		usernameLabel.setLayoutX(125.0);
		usernameLabel.setLayoutY(135.0);
		usernameLabel.setText("Username:");
		usernameLabel.setFont(new Font(20.0));

		TextField userTxt = new TextField();
		userTxt.setLayoutX(250.0);
		userTxt.setLayoutY(135.0);
		userTxt.setPromptText("Username");

		Label passwordLabel = new Label("Password:");
		passwordLabel.setLayoutX(130.0);
		passwordLabel.setLayoutY(175.0);
		passwordLabel.setFont(new Font(20.0));

		PasswordField passwordTxt = new PasswordField();
		passwordTxt.setLayoutX(250.0);
		passwordTxt.setLayoutY(175.0);
		passwordTxt.setPromptText("Password");
		passwordTxt.setOnAction(e -> {// Exception handling for connecting to the database
			try {
				// get a connection to the database
				Connection myConn = DriverManager.getConnection(
						"jdbc:mysql://127.0.0.1:3306/demo", "root",
						"programmingfinal1");
				// create a statement
				Statement myStat = myConn.createStatement();
				// execute a query
				ResultSet myRs;

				// collects user name from the user name text field and assigns to a string
				// called user
				setUser(userTxt.getText().trim());

				// Collects password from the password text field and assigns to a string called
				// password
				setPassword(passwordTxt.getText().trim());

				// SQL query to check if user name and password is in database
				String sqlUserCheck = "SELECT `username`, `id` FROM `flights`.`users` where username = '" + getUser()
						+ "' and password = '" + getPassword() + "'";
				myRs = myStat.executeQuery(sqlUserCheck);

				// Creates a variable for future checking
				int count = 0;

				// While loop that will determine if user is in the database
				while (myRs.next()) {
					count = count + 1;

				}
				myStat.close();
				myRs.close();
				myConn.close();

				// takes the user to the main page if the password is correct
				if (count == 1) {
					Main MainPage = new Main();
					MainPage.start(primaryStage);


				}

				/*
				  If user is not in database or password is incorrect, an error message is
				  displayed prompting change in user name or password, attempt password
				  recovery, or prompts the user to register if they do not have an account
				 */
				else if (count < 1) {
					AlertBox.display("Incorrect Log In",
							"\nUsername and password combination is incorrect."
							+ "\n Please select the forgot password if your password is unknonwn, or the register option to create an account.");
				}

			}

			catch (Exception ex) {

			}

		});

		// login button and event handler
		Button login = new Button("Log In");
		login.setLayoutX(250.0);
		login.setLayoutY(210.0);
		login.setMnemonicParsing(false);
		login.setPrefHeight(25.0);
		login.setPrefWidth(150.0);
		login.setText("Log In");

		login.setOnAction(e -> {

			// Exception handling for connecting to the database
			try {
				// get a connection to the database
				Connection myConn = DriverManager.getConnection(
						"jdbc:mysql://127.0.0.1:3306/demo", "root",
						"programmingfinal1");
				// create a statement
				Statement myStat = myConn.createStatement();
				// execute a query
				ResultSet myRs;

				// collects user name from the user name text field and assigns to a string
				// called user
				setUser(userTxt.getText().trim());

				// Collects password from the password text field and assigns to a string called
				// password
				setPassword(passwordTxt.getText().trim());

				// SQL query to check if user name and password is in database
				String sqlUserCheck = "SELECT `username` FROM `flights`.`users` where username = '" + getUser()
						+ "' and password = '" + getPassword() + "'";
				myRs = myStat.executeQuery(sqlUserCheck);

				// Creates a variable for future checking
				int count = 0;

				// While loop that will determine if user is in the database
				while (myRs.next()) {

					count = count + 1;

				}

				myRs.close();
				myStat.close();
				myConn.close();

				// Takes user to main page if user input matches database
				if (count == 1) {
					Main MainPage = new Main();
					MainPage.start(primaryStage);


				}

				/*
				  If user is not in database or password is incorrect, an error message is
				  displayed prompting change in user name or password, attempt password
				  recovery, or prompts the user to register if they do not have an account
				 */
				else if (count < 1) {
					AlertBox.display("Incorrect Log In",
							"Username and password combination is incorrect."
							+ "\n Please select The 'Forgot Password' option if your password is unknonwn, \n or the register option to create an account.");
				}

			}

			catch (Exception ex) {

			}
			;
		});

		Button register = new Button("Register");
		register.setLayoutX(250.0);
		register.setLayoutY(240.0);
		register.setMnemonicParsing(false);
		register.setPrefHeight(25.0);
		register.setPrefWidth(149.0);
		register.setOnAction(e -> {
			Register registerPage = new Register();
			try {
				registerPage.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		//recover password button
	    Button recPass = new Button("Forgot Password");
		recPass.setLayoutX(250.0);
		recPass.setLayoutY(270.0);
		recPass.setMnemonicParsing(false);
		recPass.setPrefHeight(26.0);
		recPass.setPrefWidth(150.0);
		recPass.setOnAction(e -> {
			RecoverPassword recoverPage = new RecoverPassword();
			try {

				recoverPage.start(primaryStage);

			}

			catch (Exception e1) {
			}
		});


		Button exit = new Button("Exit");
		exit.setLayoutX(250.0);
		exit.setLayoutY(300.0);
		exit.setMnemonicParsing(false);
		exit.setPrefHeight(25.0);
		exit.setPrefWidth(150.0);
		exit.setOnAction(e -> {
			AlertBox.display("Exit", "The system will now exit.");
			System.exit(0);
		});

		exit.setMinWidth(150);
		register.setMinWidth(150);
		recPass.setMinWidth(150);
		login.setMinWidth(150);



		anchor.getChildren().addAll(userTxt, passwordTxt, login, register, recPass, usernameLabel, exit,
				loginLabel, passwordLabel);
		scene = new Scene(anchor, 550, 370);
		/* setImg(new Image(STYLESHEET_MODENA));
		 BackgroundImage bgImg = new BackgroundImage(
				 new Image("C:\Users\Student\Desktop\bw-gradient"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false);
		anchor.setBackground(new Background(bgImg));
		;
		*/

		BackgroundFill myBF = new BackgroundFill(Color.LIGHTSTEELBLUE, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));
		anchor.setBackground(new Background(myBF));
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.centerOnScreen();
	}


	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}


}