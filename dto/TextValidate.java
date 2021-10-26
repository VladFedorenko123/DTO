package src.srccode.dto;

import src.srccode.interfaces.Validate;

public class TextValidate implements Validate {
	@Override
	public boolean validate(String str) {
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}
}
