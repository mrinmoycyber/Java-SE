package com.mathdemo;

public class MathDemo {

	public static void main(String[] args) {
		
		System.out.print("Absolute :");
        System.out.println(Math.abs(-123));  // Absolute value -> it will give us positive value
        
        
        System.out.print("Absolute :");
        System.out.println(StrictMath.abs(-123));  // For more precise result but use math.abs
        
       
        
        System.out.print("Cube Root :");
        System.out.println(Math.cbrt(27)); // 3 * 3 * 3 = 27
        
        
        
        System.out.print("Exact Decrement :"); 
    //System.out.println(Math.decrementExact(Integer.MIN_VALUE)); // It will prevent a number to get underflow
        
        int i=Integer.MIN_VALUE;
       i--;
        System.out.println(i);
        
        
        System.out.print("Exponent value in Floating Point Rep. :");
        System.out.println(Math.getExponent(123.45));   // Mantissa exponent
        
        
                
               
        System.out.print("Round Division :");
        System.out.println(Math.floorDiv(50, 9)); // It will remove the decimal part from the reminder
        
        
        System.out.print("e power x :"); 
        System.out.println(Math.exp(1));
        
        
        System.out.print("e power x :");
        System.out.println(StrictMath.exp(1));

       
        System.out.print("Log base 10 :");
        System.out.println(Math.log10(100));
        
        
        System.out.print("Maximum :");
        System.out.println(Math.max(100, 50));
        
        
        System.out.print("Tan :");
        System.out.println(Math.tan(45*Math.PI/180)); // It will give radian value
       
       
        System.out.print("Convert to Radians :");
        System.out.println(Math.toRadians(90));  // degree converted to radian
        
        System.out.print("Convert to Degree :");
        System.out.println(Math.toDegrees(Math.atan(1))); // radian converted to degrees 

        
        System.out.print("Convert To Degree :");
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));

        
        
        System.out.print("Random :");
        System.out.println(Math.random()*1000); // Giving random number between zero to one 
        
        
        System.out.print("Power :");
        System.out.println(Math.pow(2, 3)); 
        
        
        System.out.print("Excact Product :");
        System.out.println(Math.multiplyExact(100, 200)); /*If the result is within a range then it gives you that result. 
                                                          Otherwise it throws arithmetic exception*/
        
        
        System.out.print("Next Float Value :");
        System.out.println(Math.nextAfter(12.5, 11)); // It will give next float number after 12.5
		
	}

}
