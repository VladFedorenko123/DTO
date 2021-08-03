package src.srccode.dto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import src.srccode.interfaces.Propertiess;

public class PropertiesImplementation implements Propertiess {
	@Override
	public List<String> getProperties() {
		try (InputStream input = new FileInputStream(
				"/home/vlad/eclipse-workspace/DTO/configuration.properties")) {
			Properties prop = new Properties();

			prop.load(input);

			List<String> propertyList = new ArrayList<String>();
			propertyList.add(prop.getProperty("database.mongoUrl"));
			propertyList.add(prop.getProperty("database.mongoPort"));
			propertyList.add(prop.getProperty("database.mongoDatabase"));
			propertyList.add(prop.getProperty("database.mongoCollection"));
			propertyList.add(prop.getProperty("database.mysqlUrl"));
			propertyList.add(prop.getProperty("database.mysqlUser"));
			propertyList.add(prop.getProperty("database.mysqlPassword"));

			return propertyList;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
