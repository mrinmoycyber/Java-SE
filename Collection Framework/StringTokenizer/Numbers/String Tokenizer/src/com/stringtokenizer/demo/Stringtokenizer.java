package com.stringtokenizer.demo;

import java.io.FileInputStream;
import java.util.*;

public class Stringtokenizer {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C://Users//Mrinu//numbers.txt");
		byte b[] = new byte[fis.available()];
		fis.read(b);

		String data = new String(b);

		StringTokenizer stk = new StringTokenizer(data, ","); // data as parameter, mention all the delimiters.
		String s;
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		while (stk.hasMoreTokens()) {  // method is used to test if there are more tokens available from this tokenizer's string.
			s=stk.nextToken(); // method of StringTokenizer class is used to return the next token one after another from this StringTokenizer.
			al.add(Integer.valueOf(s));   /*Here I cannot store a string, 
			                              I have to store integers because in arraylist the data type I taken is integer
			                              type object. Convert this to a string into a integer.*/
		
		}
		
		System.out.println(al);

		fis.close();
	}

}
