package src.srccode.dto;

import src.srccode.interfaces.Consonant;
import src.srccode.interfaces.Json;
import src.srccode.interfaces.Time;
import src.srccode.interfaces.Vowels;

public class JsonBuilder implements Json {
	@Override
	public void printJson(String text) {
		Vowels vowels = new VowelsCalculator();
		Consonant consonant = new ConsonantCalculator();
		Time timestamp = new TimestampOfCreatingText();

		AnalysesDTO dto = new AnalysesDTO(vowels.getVowels(text), consonant.getConsonant(text),
				timestamp.getTimestamp());

		System.out.println("\"Text\": " + "\"" + text + "\"" + "\n\"Timestamp of creating text\": " + dto.getTimestamp()
				+ "\n\"Vowesl Number:\" " + dto.getVowelsNumber() + "\n\"Consonant Nubmber:\" "
				+ dto.getConsonantNumber());
	}
}
