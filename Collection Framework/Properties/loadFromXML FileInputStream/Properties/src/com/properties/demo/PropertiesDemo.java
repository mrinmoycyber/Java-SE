package com.properties.demo;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();

		p.loadFromXML(new FileInputStream("C://Users//Mrinu/MyData.xml"));
		
		System.out.println(p);
		System.out.println(p.getProperty("Name"));// If we want to just print name of a person

	}

}
