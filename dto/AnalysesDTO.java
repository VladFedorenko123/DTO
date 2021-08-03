package src.srccode.dto;

import java.sql.Timestamp;

public class AnalysesDTO {
	private int vowelsNumber;
	private int consonantsNumber;
	private Timestamp timestamp;

	public AnalysesDTO(int vowelsNumber, int consonantNumber, Timestamp timestamp) {
		this.vowelsNumber = vowelsNumber;
		this.consonantsNumber = consonantNumber;
		this.timestamp = timestamp;
	}

	public AnalysesDTO() {
	}

	public int getVowelsNumber() {
		return vowelsNumber;
	}

	public void setVowelsNumber(int vowelsNumber) {
		this.vowelsNumber = vowelsNumber;
	}

	public int getConsonantNumber() {
		return consonantsNumber;
	}

	public void getConsonantNumber(int consonantNumber) {
		this.consonantsNumber = consonantNumber;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
