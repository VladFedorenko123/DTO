package src.srccode.dto;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import src.srccode.interfaces.MongoDBConnector;
import src.srccode.interfaces.Propertiess;

public class MongoDBConnection implements MongoDBConnector {

	public MongoDBConnection(com.mongodb.client.MongoClient mongo) {
	}

	@Override
	public String connection() {
		Propertiess properties = new PropertiesImplementation();

		MongoClient mongo = new MongoClient(properties.getProperties().get(0), Integer.parseInt(properties.getProperties().get(1)));
		MongoDatabase db = mongo.getDatabase(properties.getProperties().get(2));
		MongoCollection<Document> collection = db.getCollection(properties.getProperties().get(3));

		String text = collection.find().first().getString("str");

		mongo.close();
		return text;

	}
}
