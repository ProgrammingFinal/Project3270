package application;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/demo";
		String user = "root";
		String password = "programmingfinal1";
		Connection myConn = null;
		Statement stmt = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		String customerID = "1020";
		String firstName = "'" +  "Test" + "'";
		String lastName = "'" + "Person" + "'";
		
		
		
		

		try  {
			// 1. Get a connection to the database
			myConn = DriverManager.getConnection(url, user, password);
			// 2. Create a statement
			stmt = myConn.createStatement();
			
			//Prepare Statement
			myStmt = myConn.prepareStatement("select * from customer where customerID > ? and firstName =?");
			
			// 3. Execute SQL Query - Insert Into Statements
			String sql = "insert into customer " 
					+ "(CustomerID, FirstName, LastName)"
					+ " values (" + customerID + ", " + firstName + ", " + lastName + ");"; 
			
			stmt.executeUpdate(sql);
			
			System.out.println("Insert complete.");
			
			
			// 3.1 Execute SQL Query - Delete Statements
			String sql2 = "delete from customer where lastName = 'Caruthers'";
			
			int rowsAffected = myStmt.executeUpdate(sql2);
			
			System.out.println("Rows affected: " + rowsAffected);
			System.out.println("Delete complete.");
			
			
			myRs = stmt.executeQuery("select * from customer");
			
			// Prepared Statements 
			myStmt.setDouble(1, 1001);
			myStmt.setString(2, "Tom");
			
			// 4. Process the result set
			 while (myRs.next()) {
				 System.out.println(myRs.getString("CustomerID") + ", " + myRs.getString(("FirstName") + ", " + myRs.getString("LastName")));
			 } 
			
			
			
		}
		
		catch (Exception exc) {
			exc.printStackTrace();
			
		}
	}

}
