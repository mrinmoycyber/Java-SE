package com.tv.com;

class TV {
	public void switchON() {
		System.out.println("TV is switched ON");
	}

	public void changeChannel() {
		System.out.println("TV channel is changed");
	}
}

class SmartTV extends TV {
	@Override
	public void switchON() {
		System.out.println("Smart TV is switched ON");
	}

	@Override
	public void changeChannel() {
		System.out.println("Smart TV channel is changed");
	}

	public void browse() {
		System.out.println("Smart TV Browsing");
	}
}

public class Overriding {
	public static void main(String[] args) {
//		TV t = new TV();
//		t.switchON();
//		t.changeChannel();

//		SmartTV s = new SmartTV();
//		s.switchON();
//		s.browse();

		TV t = new SmartTV(); // taking a reference of super class and holding a object of sub class
		t.switchON();
		t.changeChannel();
	}
}
