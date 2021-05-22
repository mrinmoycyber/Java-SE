package com.printstream.demo;

import java.io.*;

class Student {
 int rollno;
 String name;
 String dept;
}

public class PrintStreamDemo {
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 * stu.txt is a file upon that FileOutputStream is attached. And upon that PrintStream attach. So the 'ps' is an object of stream.
	 * So, whatever I write inside the stream object will go in the FileOutputStream and that will go into  stu.txt file.
	 */

	public static void main(String[] args) throws Exception {
   FileOutputStream fos = new FileOutputStream("C:\\Users\\Mrinu\\stu.txt");
   PrintStream ps = new PrintStream(fos);

   Student s = new Student();
   
   s.rollno=10;
   s.name="Ricky";
   s.dept="C.S.E";
   
   // For write it in PrintStream. So, that it will go into the stu.txt file.
      ps.println(s.rollno);
      ps.println(s.name);
      ps.println(s.dept);
   // OUTPUT -> Remember it has return three Strings [ 10, Ricky, C.S.E ] 
   
      ps.close();
      fos.close();
   
	}

}
