package com.mrinu;

public class OneDimesionalArray {
        #Declaring an array
	public static void main(String[] args) {
		int A[] = new int[10];
		int B[] = { 1, 2, 3, 4, 5 };
		int C[];
		C=new int[10];
		int[] D=new int[5];
               #Changing the index 2 value in the array
		 //B[2] = 15;
              
		// for(int i=0;i<A.length;i++) { System.out.println(A[i]); }

		 //for(int i=0;i<B.length;i++) { System.out.println(B[i]); }

		/*for (int x : B) {
			System.out.println(x++);
		}
		for (int x : B) {
			System.out.println(x);
		}*/

		
		  for(int i=0;i<B.length;i++) { 
			  System.out.println(B[i]++); 
			  }
			for (int x : B) {
				System.out.println(x);
			}
		 

		//System.out.println(B.length);

	}

}
