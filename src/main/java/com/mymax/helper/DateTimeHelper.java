package com.mymax.helper;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeHelper {

	public static Date convertStringToShortDateFormat(String stringDate) {
		SimpleDateFormat shortDateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		Date result = null;
		
		try {
			result = shortDateFormatter.parse(stringDate);
		} catch (ParseException e) {
			result = date;
		}
		
		return result;
	}
	
	public static String getCurentTimestamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat longDateFormatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		
		return longDateFormatter.format(timestamp);
	}
	
	public static String getCurrentShortTime() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime=time.format(dtf);
		
		return formattedTime;
	}
	
}
