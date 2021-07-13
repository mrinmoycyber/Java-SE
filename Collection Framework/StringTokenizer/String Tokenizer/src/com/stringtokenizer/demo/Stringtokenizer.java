package com.stringtokenizer.demo;

import java.io.FileInputStream;
import java.util.*;

public class Stringtokenizer {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C://Users//Mrinu//Studen4.txt");
		byte b[] = new byte[fis.available()];
		fis.read(b);

		String data = new String(b);

		StringTokenizer stk = new StringTokenizer(data, "="); // data as parameter, mention all the delimiters.
		String s;
		while (stk.hasMoreTokens()) {
			s = stk.nextToken();
			System.out.println(s);
		}

		fis.close();
	}

}
