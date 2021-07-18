package com.timexone.demo;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();
		
		/**
		 * Change the TimeZone
		 * We have to mention TimeZone only as a parameter. 
		 */
		gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));// Change the TimeZone

		TimeZone tz = gc.getTimeZone();
		System.out.println(tz);
		System.out.println(tz.getDisplayName()); // Name of the time zone.
		System.out.println(tz.getID()); // ID of the time zone

	}

}
