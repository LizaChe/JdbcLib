package by.htp.dao;


import java.sql.*;
public class DaoImpl implements DaoInterface {

	@Override
	public ResultSet dbconnection(String query)throws SQLException {
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			} catch (ClassNotFoundException e) { 
			e.printStackTrace(); 
			} 
			String url = "jdbc:oracle:thin:system@//localhost:1521/xe"; 
			String name = "system"; 
			String password = "123"; 
			Connection connection = DriverManager.getConnection(url, name, password); 
			Statement statement = connection.createStatement(); 
			ResultSet res = statement.executeQuery(query);

		
	
		return res;
	}

}
