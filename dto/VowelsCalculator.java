package src.srccode.dto;

import src.srccode.interfaces.Vowels;

public class VowelsCalculator implements Vowels {
	@Override
	public int getVowels(String text) {
		text = text.toLowerCase();
		int vowelsCounter = 0, vowels = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
					|| text.charAt(i) == 'u' || text.charAt(i) == 'y') {
				vowelsCounter++;
			}
		}
		return vowels += vowelsCounter;
	}
}
