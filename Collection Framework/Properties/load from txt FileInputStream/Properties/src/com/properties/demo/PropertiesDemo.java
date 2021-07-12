package com.properties.demo;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();

		p.load(new FileInputStream("C://Users//Mrinu/MyData.txt"));
		
		System.out.println(p);
		System.out.println(p.getProperty("Type"));

		
	}

}
