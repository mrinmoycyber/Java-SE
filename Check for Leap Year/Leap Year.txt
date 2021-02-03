/*IF 
  Any year that s divisible by 400 is definitely a leap year.
  
  ELSE IF
   If divisible by 4 AND not divisible by 100 then a Leap Year.
   
    ELSE
    not  a leap year*/
package com.CheckLeapYear;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2400;
		if (year % 400 == 0) {
			System.out.println("Leap Year");
		}

		else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("not a leap year");
		}
		int year1 = 2016;
		if ((year1 % 400 == 0) || (year1 % 4 == 0 && year % 100 != 0)) {
			System.out.println("Leap year");

		} else {
			System.out.println("not a Leap year");
		}
	}

}
