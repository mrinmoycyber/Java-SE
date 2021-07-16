package com.date.demo;

import java.util.Date;

public class DateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date d = new Date ("7/16/2021");  //MM/DD/YYYY
		
		System.out.println(d.getDate());
		System.out.println(d.getDay()); // It will calculate the day of the week and day's of a week start from zero onwards.
		                                // O- Sunday, 1- Monday, 2- Tuesday, 3-Wednesday. 4-Thursday, 5-Friday, 6- Saturday,
		System.out.println(d.getMonth()); // months also start from zero. 0->Jan, 1->Feb, 2->Mar, 3->Apr, 4->May, 5->Jun, 6->Jul, 
		                                  // 7->Aug, 8->Sep, 9->Oct, 10->nov, 11->Dec.
		System.out.println(d.getYear()+1900); // We have to add 1900 because it calculate start from 1900, then only we can get the exact year.
		
	}

}
