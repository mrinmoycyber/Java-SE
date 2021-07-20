package com.datetimeformatter.demo;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {

	public static void main(String[] args) {
		ZonedDateTime ldt = ZonedDateTime.now();

		// Create an object for DateTimeFormatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm::ss z Z");
		System.out.println(dtf.format(ldt));

	}

}
