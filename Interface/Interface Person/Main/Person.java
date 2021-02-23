package client.Main;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
	}

	@Override
	public void study() {
		System.out.println("Studying");
	}

	@Override
	public void makeVideo() {
		System.out.println("Making good video");
	}

}
