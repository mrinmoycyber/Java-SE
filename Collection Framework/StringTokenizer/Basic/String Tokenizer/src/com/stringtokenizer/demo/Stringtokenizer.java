package com.stringtokenizer.demo;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) throws Exception {

		String data = "name=Mrinmoy;address=Delhi;country=India;dept=ECE";

		StringTokenizer stk = new StringTokenizer(data, "=;");
		String s;

		while (stk.hasMoreTokens()) {
			s = stk.nextToken();  
			System.out.println(s);
		}

	}

}
