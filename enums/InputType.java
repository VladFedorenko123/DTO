package src.srccode.enums;

public enum InputType {
	CONSOLE("Console"), FILE("File"), DB("DB");

	private final String inputType;

	InputType(String inputType) {
		this.inputType = inputType;
	}

	public String getInputType() {
		return inputType;
	}
}
