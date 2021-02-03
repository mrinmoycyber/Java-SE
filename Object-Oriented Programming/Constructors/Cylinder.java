package com.cylinder.test;

public class Cylinder {
	private int radius;
	private int height;

	public Cylinder() {
		radius = height = 1; // why we are doing this??
	}

	public Cylinder(int r, int h) {
		radius = r;
		height = h;
	}

	public int getHeight() {
		return height;
	}

	public int getRadius() {
		return radius;
	}

	public void setHeight(int h) {
		if (h > 0)
			height = h;
		else
			height = 0;
	}

	public void setRadius(int r) {
		if (r > 0)
			radius = r;
		else
			radius = 0;
	}

	public void setDimension(int h, int r) {
		height = h;
		radius = r;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double lidArea() {
		return 2 * Math.PI * radius * radius;
	}

	public double drumArea() {
		return 2 * lidArea() + perimeter() * height;
	}

	public double volume() {
		return lidArea() * height;
	}

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setHeight(10);
		c.setRadius(5);
		c.setDimension(10, 5);

		System.out.println("LidArea: " + c.lidArea());
		System.out.println("Circumference: " + c.perimeter());
		System.out.println("TotalSurfaceArea: "+ c.drumArea());
		System.out.println("Volume: " + c.volume());
		System.out.println("Height: " + c.getHeight());
		System.out.println("Radius: " + c.getRadius());
	}

}
