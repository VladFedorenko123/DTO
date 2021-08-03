package src.srccode.dto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import src.srccode.interfaces.MySQLConnector;

public class MySQLConnect implements MySQLConnector {
	@Override
	public Connection connection() {
		try (InputStream input = new FileInputStream("/home/vlad/eclipse-workspace/DTO/configuration.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			return DriverManager.getConnection(prop.getProperty("database.mysqlUrl"),
					prop.getProperty("database.mysqlUser"), prop.getProperty("database.mysqlPassword"));
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return null;
		} catch (IOException e2) {
			e2.printStackTrace();
			return null;
		}
	}
}
