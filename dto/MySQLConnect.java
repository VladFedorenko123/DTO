package src.srccode.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import src.srccode.interfaces.MySQLConnector;
import src.srccode.interfaces.Propertiess;

public class MySQLConnect implements MySQLConnector {
	@Override
	public Connection connection() {
		try {
			Propertiess properties = new PropertiesImplementation();
			return DriverManager.getConnection(properties.getProperties().get(4), properties.getProperties().get(5),
					properties.getProperties().get(6));
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}
}
