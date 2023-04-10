package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

	private static String HOST = "127.0.0.1";
	private static int PORT = 3306;
	private static String DP_NAME = "jdbcTest_db";
	private static String USERNAME = "root";
	private static String PASSWORD = "";
	
	private static Connection connection;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection =  DriverManager.getConnection(String.format("Jdbc:mysql://%s:%d/%s",HOST, PORT ,DP_NAME), USERNAME, PASSWORD);
		} catch (SQLException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	 
				return connection;
	}
	
}
