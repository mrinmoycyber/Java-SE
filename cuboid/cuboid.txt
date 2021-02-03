package com.cuboid;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int length, breadth, height;
		int totalArea, volume;
		System.out.println("Enter Length breadth and height");
		length = sc.nextInt();
		breadth = sc.nextInt();
		height = sc.nextInt();
		//front/back=length*height right/left=breadth*height bottom/top= length*breadth 
		totalArea = 2 * (length * breadth + length * height + breadth * height);
		//volume= length*breadth
		volume = length * breadth * height;
		System.out.println("Total Area " + totalArea);
		System.out.println("Volume " + volume);

	}

}
