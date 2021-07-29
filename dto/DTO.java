package src.srccode.dto;

import java.sql.Timestamp;

public class DTO {

	public static final String InputType = null;
	private int vowelsNumber;
	private int consonantNumber;
	private Timestamp timestamp;
	private String line;

	public DTO(int vowelsNumber, int consonantNumber, Timestamp timestamp, String line) {
		this.vowelsNumber = vowelsNumber;
		this.consonantNumber = consonantNumber;
		this.timestamp = timestamp;
		this.line = line;
	}

	public DTO() {
	}

	public int getVowelsNumber() {
		return vowelsNumber;
	}

	public void setVowelsNumber(int vowelsNumber) {
		this.vowelsNumber = vowelsNumber;
	}

	public int getConsonantNumber() {
		return consonantNumber;
	}

	public void getConsonantNumber(int consonantNumber) {
		this.consonantNumber = consonantNumber;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getLine() {
		return line;
	}

	public void setLine (String line) {
		this.line = line;
	}
}
