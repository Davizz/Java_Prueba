package com.ludo.bdd.crud.other;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Tiempo {
	
	public static Date getTimeStamp(String zone) {
//		System.setProperty("user.timezone", "Europe/Madrid"); 
//		TimeZone.setDefault(TimeZone.getTimeZone("Spain")); 
//		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("Europe/Madrid"))); 
		
		
		Calendar cal = Calendar.getInstance(); 
		Date dateReprensentation = cal.getTime(); 
		return dateReprensentation; 
		
	}

}
