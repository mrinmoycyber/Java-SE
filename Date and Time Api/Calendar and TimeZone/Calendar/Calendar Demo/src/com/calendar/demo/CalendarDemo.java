package com.calendar.demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		GregorianCalendar gc=new GregorianCalendar();
		
		System.out.println(gc.isLeapYear(2020));  // 2020 is a Leap year, it will return true. 
		System.out.println(gc.isLeapYear(2021)); // It will tell us the given year is leap year or not?
		System.out.println(gc.get(Calendar.DATE)); // We have to pass some field and those fields are available in a class calendar.
		                                           // It will tell us today's date from Gregorian calendar.
		System.out.println(gc.get(Calendar.MONTH)); 
		System.out.println(gc.get(Calendar.DAY_OF_WEEK)); // This will follow day of the week starting from one onwards not from zero onwards.
		                                                  // Sunday is the starting day [Sunday->1, Monday->2...]
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));  /* It will show us which day it's in the year. [o/p- 197 means already 197 days 
                                                            passed in this year]*/
	}

}
