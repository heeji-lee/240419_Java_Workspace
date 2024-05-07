package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMake {
	
	public static String now() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String nowString = now.format(dateTimeFormatter);
		return nowString;
	}
	
}
