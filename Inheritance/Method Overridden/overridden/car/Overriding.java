package car;

class Car {
	public void start() {
		System.out.println("Car Started");
	}

	public void accelerate() {
		System.out.println("Car is Accelerated");
	}

	public void changeGear() {
		System.out.println("Car Gear Changed");
	}
}

class LuxaryCar extends Car {
	@Override
	public void changeGear() {
		System.out.println("Automaitc Gear");
	}

	public void openRoof() {
		System.out.println("Sun Roof is Opened");
	}
}

public class Overriding {
	public static void main(String[] args) {
//		Car c = new Car();
//		c.start();
//		c.accelerate();
//		c.changeGear();
		LuxaryCar l = new LuxaryCar();
		l.start();
		l.accelerate();
		l.changeGear();  //when we create an object of child class and call override method then the method of child class will be called..
		l.openRoof();
		
//		Car c = new LuxaryCar();  // taking a reference of super class and holding a object of sub class
//		c.start();
//		c.accelerate();
//		c.changeGear();
	}

}
