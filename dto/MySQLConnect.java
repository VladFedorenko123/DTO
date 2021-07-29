package src.srccode.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import src.srccode.interfaces.MySQLConnector;

public class MySQLConnect implements MySQLConnector {
	@Override
	public Connection connection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/string", "root", "password");
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}
}
