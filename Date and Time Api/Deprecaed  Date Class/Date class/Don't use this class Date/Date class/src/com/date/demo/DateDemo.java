package com.date.demo;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date("15/10/1998"); /*  don't use this class
											 * Here we can mention the date by ourself, like in the form of string. We
											 * can create an object for any date we want to mention,
											 * if we don't give any parameters then we get a current date.
											 */
		System.out.println(d);

	}

}
