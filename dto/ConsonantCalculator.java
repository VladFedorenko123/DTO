package src.srccode.dto;

import src.srccode.interfaces.Consonant;

public class ConsonantCalculator implements Consonant {
	@Override
	public int getConsonant(String text) {
		text = text.toLowerCase();
		int consonantCounter = 0, consonant = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'b' || text.charAt(i) == 'c' || text.charAt(i) == 'd' || text.charAt(i) == 'f'
					|| text.charAt(i) == 'g' || text.charAt(i) == 'j' || text.charAt(i) == 'k' || text.charAt(i) == 'l'
					|| text.charAt(i) == 'm' || text.charAt(i) == 'n' || text.charAt(i) == 'p' || text.charAt(i) == 'q'
					|| text.charAt(i) == 's' || text.charAt(i) == 't' || text.charAt(i) == 'v' || text.charAt(i) == 'x'
					|| text.charAt(i) == 'z' || text.charAt(i) == 'h' || text.charAt(i) == 'r'
					|| text.charAt(i) == 'w') {
				consonantCounter++;

			}
		}

		return consonant += consonantCounter;
	}
}
