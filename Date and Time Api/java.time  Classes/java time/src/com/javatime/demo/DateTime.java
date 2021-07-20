package com.javatime.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);

		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt); // offset- +05:30

		ZonedDateTime zat = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(zat);

		Period p = Period.of(2, 2, 10);
		System.out.println(p.addTo(LocalDate.now())); /*
														 * add local date to period p. Simply it will add 2 years, 2
														 * months and 10 days to our current date.
														 */
		Instant i=Instant.now();
		System.out.println(i); // Right now my time is 12:08 but it shows 06:38 because it's calculate in  Greenwich Mean Time GMT.

	}

}