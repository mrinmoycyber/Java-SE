//Overloaded method to calculate areas


package com.mrinu;

public class CalculateArea {
	 double area (double radius) {     //return type= double, area = method name, double radius = parameter list
		return Math.PI*radius*radius;
	}
double area(double length, double breadth) {
	return length*breadth;
}
public static void main(String[] args) {
	 CalculateArea a=new  CalculateArea();
	 System.out.println(a.area(8));
	 System.out.println(a.area(15,10));
	}

}
