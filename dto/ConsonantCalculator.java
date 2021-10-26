package src.srccode.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.srccode.interfaces.Consonant;

public class ConsonantCalculator implements Consonant {
	private static final List<Character> CONSONANTS = new ArrayList<>(Arrays.asList('b', 'c', 'd', 'f', 'q', 'j', 'k',
			'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 'h', 'r', 'w'));

	@Override
	public int getConsonant(String text) {
		text = text.toLowerCase();
		int consonantCounter = 0;
		for (int i = 0; i < text.length(); i++) {
			if (CONSONANTS.contains(text.charAt(i))) {
				consonantCounter++;
			}
		}
		return consonantCounter;
	}
}
