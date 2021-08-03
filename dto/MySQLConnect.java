package src.srccode.dto;

import java.sql.Connection;
import java.sql.DriverManager;

import src.srccode.interfaces.MySQLConnector;

public class MySQLConnect implements MySQLConnector {
	@Override
	public Connection connection() {
		try {
			PropertySingleton propertySingleton = PropertySingleton.getInstance();

			return DriverManager.getConnection(propertySingleton.mySqlUrl, propertySingleton.mySqlUser,
					propertySingleton.mySqlPassword);
		} catch (Throwable e) {
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
	}
}
