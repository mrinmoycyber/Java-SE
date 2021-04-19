package com.reflectionpackage;

import java.lang.reflect.*;

class My {

	private int a;
	protected int b;
	public int c;
	int d;

	public My() {
	}

	public My(int x, int y) {
	}

	public void display(String s1, String s2) {
	}

	public int show(int x, int y) {
		return 0;
	}

}

public class ReflectDemo {

	public static void main(String[] args) {

		// Definition of a class
		Class c = My.class;

		/*
		 * Definition of a class with creating an object Class d = My.class; My m = new
		 * My(); Class c1=m.getClass();
		 */
//		System.out.println(c.getName());
//		
//    	Field field[] = c.getDeclaredFields(); /*four declared fields private int a; 
//		                                       protected int b;public int c;int d;*/
//		 for(Field f:field)
//		System.out.println(f);
		
		// Details of those constructors
//		Constructor con[] = c.getConstructors(); //getting constructors in the form of an array
//		
//          for(Constructor ct:con)
//		System.out.println(ct);
          
       // Methods
         Method meth[]=c.getMethods();
//        
//        for(Method m:meth)
//        	System.out.println(m);
//        
        // Display method parameters
		Parameter param[]=meth[0].getParameters();
		
		for(Parameter p:param)
			System.out.println(p); /*It will give the type [here type is string] not name and 
			                        it's giving the set of parameters also for that method*/
		

	}

}
