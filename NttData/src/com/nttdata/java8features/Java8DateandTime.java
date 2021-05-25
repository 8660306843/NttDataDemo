package com.nttdata.java8features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Java8DateandTime
{
	public static void main(String[] args)
	{
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		
		ZoneId zz=ZoneId.of("Europe/Paris");
		ZonedDateTime zzz=ZonedDateTime.now();
		System.out.println(zzz);
		
		//format Date
		LocalDate ll=LocalDate.now();
		String s=ll.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL));
		System.out.println(s);
		
	}

}
