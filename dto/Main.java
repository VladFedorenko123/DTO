package src.srccode.dto;

import java.util.Scanner;

import src.srccode.enums.InputType;
import src.srccode.interfaces.CollectionList;
import src.srccode.interfaces.Json;
import src.srccode.interfaces.MongoDBConnector;
import src.srccode.interfaces.Reader;
import src.srccode.interfaces.Validate;

public class Main {
	private static boolean restart = true;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (restart) {
			Reader read = new FileRead();
			Reader readDB = new MySQLReadText();
			CollectionList collection = new SaveCollection();
			Validate validate = new TextValidate();
			MongoDBConnector mongo = new MongoDBConnection(null);
			Json json = new JsonBuilder();
			System.out.println("If you wanna work with console write \"Console\", "
					+ "want to read line from file enter \"File\", read form DataBase enter \"DB\"!");

			String workPlace = scanner.nextLine();

			if (workPlace.equals(InputType.CONSOLE.getInputType())) {
				System.out.println("Please enter some text");
				String text = scanner.nextLine();
				boolean isValid = validate.validate(text);
				if (isValid == true) {
					json.printJson(text);
					System.out.println(collection.saveList(text));
				} else {
					System.out.println("You entered text with some issues!");
					main(args);
				}
			} else if (workPlace.equals(InputType.FILE.getInputType())) {
				String text = read.getText();
				json.printJson(text);
				System.out.println(collection.saveList(text));

			} else if (workPlace.equals(InputType.DB.getInputType())) {
				System.out.println(
						"Please make a choice. If you want use MySQL Database enter \"MySQL\", MongoDB please enter \"MongoDB\"");
				String choiceDB = scanner.nextLine();
				if (choiceDB.equals("MySQL")) {
					String text = readDB.getText();
					json.printJson(text);
					System.out.println(collection.saveList(text));
				} else if (choiceDB.equals("MongoDB")) {
					String text = mongo.connection();
					json.printJson(text);
					System.out.println(collection.saveList(text));
				}
			}
		}
		scanner.close();
	}
}