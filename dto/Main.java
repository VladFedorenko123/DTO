package src.srccode.dto;

import java.util.Scanner;

import src.srccode.interfaces.Consonant;
import src.srccode.interfaces.Line;
import src.srccode.interfaces.Reader;
import src.srccode.interfaces.Time;
import src.srccode.interfaces.Vowels;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("If you wanna work with console write \"Console\", "
				+ "want to read line from file enter \"File\", read form DataBase enter \"DB\"!");

		String workPlace = scanner.nextLine();

		if (workPlace.equals(InputType.CONSOLE.getInputType())) {
			Vowels vowels = new VowelsCalculator();
			Consonant consonant = new ConsonantCalculator();
			Time timestamp = new TimestampOfCreatingText();
			Line myLine = new GetLine();

			System.out.println("Please enter some text");
			String text = scanner.nextLine();

			DTO dto = new DTO(vowels.getVowels(text), consonant.getConsonant(text), timestamp.getTimestamp(),
					myLine.getLine(text));
			System.out.println("Your entered line: " + dto.getLine() + "\nTimestamp of creating text: "
					+ dto.getTimestamp() + "\nVowesl Number: " + dto.getVowelsNumber() + "\nConsonant Nubmber: "
					+ dto.getConsonantNumber());

		} else if (workPlace.equals(InputType.FILE.getInputType())) {
			Reader read = new FileRead();
			Vowels vowels = new VowelsCalculator();
			Consonant consonant = new ConsonantCalculator();
			Time timestamp = new TimestampOfCreatingText();
			Line myLine = new GetLine();

			String text = read.getText();

			DTO dto = new DTO(vowels.getVowels(text), consonant.getConsonant(text), timestamp.getTimestamp(),
					myLine.getLine(text));
			System.out.println("Your entered line: " + dto.getLine() + "\nTimestamp of creating text: "
					+ dto.getTimestamp() + "\nVowesl Number: " + dto.getVowelsNumber() + "\nConsonant Nubmber: "
					+ dto.getConsonantNumber());

		} else if (workPlace.equals(InputType.DB.getInputType())) {
			Reader read = new MySQLReadText();
			Vowels vowels = new VowelsCalculator();
			Consonant consonant = new ConsonantCalculator();
			Time timestamp = new TimestampOfCreatingText();
			Line myLine = new GetLine();

			String text = read.getText();

			DTO dto = new DTO(vowels.getVowels(text), consonant.getConsonant(text), timestamp.getTimestamp(),
					myLine.getLine(text));
			System.out.println("Your entered line: " + dto.getLine() + "\nTimestamp of creating text: "
					+ dto.getTimestamp() + "\nVowesl Number: " + dto.getVowelsNumber() + "\nConsonant Nubmber: "
					+ dto.getConsonantNumber());
		}
		scanner.close();
	}
}

enum InputType {
	CONSOLE("Console"),

	FILE("File"), DB("DB");

	private final String inputType;

	InputType(String inputType) {
		this.inputType = inputType;
	}

	public String getInputType() {
		return inputType;
	}
}