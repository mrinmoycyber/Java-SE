package com.jodadatetime.demo;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class JDT {

	public static void main(String[] args) {

		LocalDate d = LocalDate.now(); // we cannot create a date, we have to call it from this method.
		System.out.println(d); // we will just get date.

		LocalDate ld = LocalDate.now(ZoneId.of("Asia/Tokyo")); // Date
		System.out.println(ld);

		LocalDate id = LocalDate.of(2021, Month.APRIL, 10); // If we don't want today's date, I want some other date.
		System.out.println(id);

		// Epoch day- the starting day [1, Jan 1970] is called epoch day.
		LocalDate od = LocalDate.ofEpochDay(100); // I want the date after passing thousand days of from epoch day.
		System.out.println(od);

		LocalDate cd = LocalDate.parse("2021-01-03"); // must be type - YY-MM-DD

		/**
		 * first it was January [2021-01-03] now I will add more 6 months. Remember it
		 * will not modified the o/p unless we have take it another separate object,
		 * take cd1. Now we will get a new date with six months added to it.
		 */

		LocalDate cd1 = cd.plusMonths(6);
		System.out.println(cd1);

	}

}
