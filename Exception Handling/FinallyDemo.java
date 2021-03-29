package com.FinallyDemo;

public class FinallyDemo {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		     }
		finally 
		  {
		  System.out.println("Final Message");  //If there is an exception this line will never be printed. If we want this message to be compulsorily printed, Then I should use finally block.
		  }

	}

}

//If its not confirmed that you are handling all the exceptions or not then it is better we write on the finally block, followed by catch blocks or directly under try block
 
//	static void meth1() throws Exception {
//		try {
//			throw new Exception();
//		    }
//		finally {
//			System.out.println("Final message");
//		}
//	}
//	public static void main(String[]args) throws Exception {
//		meth1();
//	}
//}