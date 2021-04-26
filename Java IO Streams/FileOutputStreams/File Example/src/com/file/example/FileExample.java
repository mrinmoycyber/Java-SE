package com.file.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		  try(FileOutputStream fos=new FileOutputStream("C:/Users/Mrinu/Test.txt");)
	        {
	        
	        String str="Learn Java Programming.";
	        
	        byte b[]=str.getBytes();
	        
	        /*
	        //fos.write(str.getBytes());
	        for(byte x:b)
	            fos.write(x);*/
	        //fos.write(b, 6, str.length()-6);
	        
	        fos.write(b);
	        
	        //fos.close();
	        
	        }
	        /*catch(FileNotFoundException e)
	        {
	            System.out.println(e);
	        }
	        catch(IOException e)
	        {
	            System.out.println(e);
	        }*/
	}

}
