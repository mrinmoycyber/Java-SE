package com.mobilePhone;

class Phone {
	public void call() {
		System.out.println("Phone Call");
	}

	public void sms() {
		System.out.println("Sending Msg");
	}
}

interface ICamera {
	void click();

	void record();
}

interface IMusicPlayer {
	void play();

	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
	public void videoCall() {
		System.out.println("Smart Phone video calling");
	}

	public void click() {
		System.out.println("Smart Phone clicking photo");
	}

	public void record() {
		System.out.println("Smart Phone recording video");
	}

	public void play() {
		System.out.println("Smart Phone playing music");
	}

	public void stop() {
		System.out.println("Smart Phone stopped playing music");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.click();
		sp.play();
		sp.sms();
//		Phone sp= new SmartPhone();
//		sp.call();
//		sp.sms();
//		IMusicPlayer sp = new SmartPhone();
//		sp.play();
//		sp.stop();
//		ICamera sp= new SmartPhone();
//		sp.click();
//		sp.record();

	}

}
