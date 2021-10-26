package src.srccode.dto;

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
		PropertySingleton propertySingleton = PropertySingleton.getInstance();

		MongoClient mongo = new MongoClient(propertySingleton.mongoUrl, Integer.parseInt(propertySingleton.mongoPort));
		MongoDatabase db = mongo.getDatabase(propertySingleton.mongoDatabase);
		MongoCollection<Document> collection = db.getCollection(propertySingleton.mongoCollection);

		String text = collection.find().first().getString("str");

		mongo.close();
		return text;
	}
}
