package com.exceptionChallenge;

public class Main {

	public static void main(String[] args) {
	   Stack st=new Stack(5);
	   try
	   {
		   st.push(10);
		   st.push(15);
		   st.push(10);
		   st.push(15);
		   st.push(10) ;
		   st.push(15);
	   }
	   catch (StackOverFlow s) {
		   System.out.println(s);
	   }

	}

}
