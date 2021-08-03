package src.srccode.dto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import src.srccode.interfaces.MongoDBConnector;

public class MongoDBConnection implements MongoDBConnector {

	public MongoDBConnection(com.mongodb.client.MongoClient mongo) {
	}

	@Override
	public String connection() {
		try (InputStream input = new FileInputStream("/home/vlad/eclipse-workspace/DTO/configuration.properties")) {
			Properties prop = new Properties();
			prop.load(input);

			MongoClient mongo = new MongoClient(prop.getProperty("database.mongoUrl"),
					Integer.parseInt(prop.getProperty("database.mongoPort")));
			MongoDatabase db = mongo.getDatabase(prop.getProperty("database.mongoDatabase"));
			MongoCollection<Document> collection = db.getCollection(prop.getProperty("database.mongoCollection"));

			String text = collection.find().first().getString("str");

			mongo.close();
			return text;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
}
