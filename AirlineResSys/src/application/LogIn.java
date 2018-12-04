package application;

import java.sql.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class LogIn extends Application implements EventHandler<ActionEvent> {
	// declare private data field variables
	private static String user = "";
	private static String password = "";

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

	// sets scene
	public static Scene scene;

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
		Label loginLabel = new Label("Enter your username and password");
		// set alignment of login label to center
		loginLabel.setAlignment(javafx.geometry.Pos.CENTER);
		// set x-coordinate of login label
		loginLabel.setLayoutX(150.0);
		// set y-coordinate of login label
		loginLabel.setLayoutY(50.0);
		//
		loginLabel.setPrefHeight(25.0);
		loginLabel.setPrefWidth(351.0);
		loginLabel.setText("Enter Your Username And Password");
		loginLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
		loginLabel.setFont(new Font(22.0));

		Label usernameLabel = new Label("Username:");
		usernameLabel.setLayoutX(189.0);
		usernameLabel.setLayoutY(131.0);
		usernameLabel.setText("Username:");
		usernameLabel.setFont(new Font(20.0));

		TextField userTxt = new TextField();
		userTxt.setLayoutX(311.0);
		userTxt.setLayoutY(133.0);
		userTxt.setPromptText("Username");

		Label passwordLabel = new Label("Password:");
		passwordLabel.setLayoutX(193.0);
		passwordLabel.setLayoutY(174.0);
		passwordLabel.setFont(new Font(20.0));

		PasswordField passwordTxt = new PasswordField();
		passwordTxt.setLayoutX(311.0);
		passwordTxt.setLayoutY(177.0);
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
							"\nUsername and password combination is either incorrect or the account does not exist."
							+ "\n Please select the forgot password if your password is unknonwn, or the register option to create an account.");
				}

			}

			catch (Exception ex) {

			}

		});

		// login button and event handler
		Button login = new Button("Log In");
		login.setLayoutX(237.0);
		login.setLayoutY(222.0);
		login.setMnemonicParsing(false);
		login.setPrefHeight(25.0);
		login.setPrefWidth(149.0);
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
							"Username and password combination is either incorrect or the account does not exist.\n Please select The 'Forgot Password' option if your password is unknonwn, \n or the register option to create an account.");
				}

			}

			catch (Exception ex) {

			}
			;
		});

		Button register = new Button("Register");
		register.setLayoutX(237.0);
		register.setLayoutY(255.0);
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
		recPass.setLayoutX(236.0);
		recPass.setLayoutY(290.0);
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
		exit.setLayoutX(236.0);
		exit.setLayoutY(328.0);
		exit.setMnemonicParsing(false);
		exit.setPrefHeight(25.0);
		exit.setPrefWidth(150.0);
		exit.setOnAction(e -> {
			AlertBox.display("Exit", "System Will Now exit.");
			System.exit(0);
		});

		exit.setMinWidth(150);
		register.setMinWidth(150);
		// RecoverPassword.setMinWidth(150);
		login.setMinWidth(150);

		anchor.getChildren().addAll(userTxt, passwordTxt, login, register, recPass, usernameLabel, exit,
				loginLabel, passwordLabel);
	}


	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}

}