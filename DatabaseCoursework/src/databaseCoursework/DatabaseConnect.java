package databaseCoursework;
import java.sql.*;

public class DatabaseConnect {
	/*
	 * TO be set before running program
	 */
	static String dbURL = "jdbc:mysql://127.0.0.1:3306/DBCW2";
	static String username = "root";
	static String password = "";
	
	/**
	 * Runs a given INSERT, DELETE or UPDATE SQL query to the database defined above
	 * @param query INSERT, DELETE or UPDATE SQL query as a string
	 */
	public static void insert(String query) {
		try {
			Connection con = DriverManager.getConnection(dbURL, username, password);
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.execute();
			preparedStmt.close();
			con.close();
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * Runs a given SELECT SQL query to the database defined above and returns
	 * a result set 
	 * @param query SELECT SQL query as a string
	 * @return A result set containing the response from the SQL query
	 */
	public static ResultSet select(String query) {
		try {
			Connection con = DriverManager.getConnection(dbURL, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return null;
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
			return null;
		}
	}
}
