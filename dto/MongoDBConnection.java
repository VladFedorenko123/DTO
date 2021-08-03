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
		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase db = mongo.getDatabase("database");
		MongoCollection<Document> collection = db.getCollection("Col");

		String text = collection.find().first().getString("str");

		mongo.close();
		return text;

	}
}
