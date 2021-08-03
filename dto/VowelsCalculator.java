package src.srccode.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.srccode.interfaces.Vowels;

public class VowelsCalculator implements Vowels {
	@Override
	public int getVowels(String text) {
		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
		text = text.toLowerCase();
		int vowelsCounter = 0;
		for (int i = 0; i < text.length(); i++) {
			if (vowels.contains(text.charAt(i))) {
				vowelsCounter++;
			}
		}
		return vowelsCounter;
	}
}
