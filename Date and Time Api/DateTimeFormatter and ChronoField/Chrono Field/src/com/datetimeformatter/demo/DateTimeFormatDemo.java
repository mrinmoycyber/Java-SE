package com.datetimeformatter.demo;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatDemo {

	public static void main(String[] args) {
		
		ZonedDateTime ldt = ZonedDateTime.now();
		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ldt.get(ChronoField.AMPM_OF_DAY)); // If it's PM, it will return 1 otherwise it will return 0 [AM].
		System.out.println(ldt.get(ChronoField.YEAR));

	}

}
