package com.StaticBlocks;

public class StaticBlock {
	static {
		System.out.println("Block1");
	}

	public static void main(String[] args) { // Nothing is inside main method...Nothing to execute but still Block 1 and Block 2 are printed because when we run the program this class
												               // (StaticBlock) will get loaded and once the class gets loaded, It will execute the static blocks.
		}
	static {
		System.out.println("Block2");
	}
}

//public class StaticBlock {
//	static {
//		System.out.println("Block1");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Main");
//	}
//
//	static {
//		System.out.println("Block2");     
//	}
//}
//OUTPUT--> Block 1 Block 2 Main