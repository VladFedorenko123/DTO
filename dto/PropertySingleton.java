package src.srccode.dto;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertySingleton {
	private static PropertySingleton instance = null;
	private static Properties prop = null;
	public String mongoUrl = null;
	public String mongoPort = null;
	public String mongoDatabase = null;
	public String mongoCollection = null;
	public String mySqlUrl = null;
	public String mySqlUser = null;
	public String mySqlPassword = null;

	protected PropertySingleton() {
		try (InputStream input = new FileInputStream("/home/vlad/eclipse-workspace/DTO/configuration.properties")) {
			prop = new Properties();
			prop.load(input);
			mongoUrl = prop.getProperty("database.mongoUrl");
			mongoPort = prop.getProperty("database.mongoPort");
			mongoDatabase = prop.getProperty("database.mongoDatabase");
			mongoCollection = prop.getProperty("database.mongoCollection");
			mySqlUrl = prop.getProperty("database.mysqlUrl");
			mySqlUser = prop.getProperty("database.mysqlUser");
			mySqlPassword = prop.getProperty("database.mysqlPassword");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static PropertySingleton getInstance() {
		if (instance == null) {
			instance = new PropertySingleton();
		}
		return instance;
	}

}
