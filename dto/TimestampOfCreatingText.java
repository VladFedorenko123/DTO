package src.srccode.dto;

import java.sql.Timestamp;

import src.srccode.interfaces.Time;

public class TimestampOfCreatingText implements Time {

	@Override
	public Timestamp getTimestamp() {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		return (time);
	}

}
