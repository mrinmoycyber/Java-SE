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
	 * Here Fis is attached with buffered reader. I have a empty student object and the values are filled here. 
	 * Values are getting from the file.
	 * i.e br.readLiner();
	 * I am reading three Strings from a file and then I am printing them.
	 */

	public static void main(String[] args) throws Exception {
   FileInputStream fis = new FileInputStream("C:\\Users\\Mrinu\\stu.txt");
   BufferedReader br = new BufferedReader(new InputStreamReader(fis)); /* Upon a InputStream we cannot assign a reader. 
                                                                        So we need a converter here [InputStreamReader].
                                                                        This will connect reader classes with stream classes*/

   Student s = new Student();
   s.rollno=Integer.parseInt(br.readLine());
   s.name=br.readLine();
   s.dept=br.readLine();
   
   System.out.println("RollNo: "+s.rollno);
   System.out.println("Name: "+s.name);
   System.out.println("Dept: "+s.dept);
  
   
      br.close();
      fis.close();
   
	}

}
