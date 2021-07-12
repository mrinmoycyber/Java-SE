package com.properties.demo;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();

		p.setProperty("Brand", "acer");
		p.setProperty("Processor", "i5");
		p.setProperty("OS", "Windows10");
		p.setProperty("Model", "Nitro");

		p.storeToXML(new FileOutputStream("C://Users//Mrinu/MyData.xml"), "Laptop");

	}

}
