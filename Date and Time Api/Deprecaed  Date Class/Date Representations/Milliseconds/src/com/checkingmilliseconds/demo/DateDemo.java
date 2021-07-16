package com.checkingmilliseconds.demo;

public class DateDemo {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()); // this will give us the number of millisecond passed
														// since my 1st Jan 1970 till current date and time.
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365); // Divided by 1000  to get seconds /60 mins/60 hr/24 day/365 one year 
		                                                // It will calculate since 1st Jan 1970 to this year.. means How many years passed in?
        System.out.println(Long.MAX_VALUE);  // Time is represented in long value. So, what is the max. value can possible?
	}

}
