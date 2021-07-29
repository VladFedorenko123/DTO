package src.srccode.dto;

import java.util.ArrayList;
import java.util.List;

import src.srccode.interfaces.CollectionList;
import src.srccode.interfaces.Consonant;
import src.srccode.interfaces.Line;
import src.srccode.interfaces.Time;
import src.srccode.interfaces.Vowels;

public class SaveCollection implements CollectionList {
	@Override
	public void saveList(String text) {
		Vowels vowels = new VowelsCalculator();
		Consonant consonant = new ConsonantCalculator();
		Time timestamp = new TimestampOfCreatingText();
		Line myLine = new GetLine();

		DTO dto = new DTO(vowels.getVowels(text), consonant.getConsonant(text), timestamp.getTimestamp(),
				myLine.getLine(text));

		List<String> listDTO = new ArrayList<String>();
		listDTO.add(dto.getLine());
		listDTO.add(dto.getTimestamp().toString());
		listDTO.add(Integer.toString(dto.getVowelsNumber()));
		listDTO.add(Integer.toString(dto.getConsonantNumber()));

		System.out.println(listDTO);
	}
}
