package com.repeat;

class box {
	public double width, depth, height;

	box()// Default const...
	{
		System.out.println("Default constructor...");
		width = 5;
		height = 4;
		depth = 3;
	}

	box(double w, double h, double d)// Parameterised const....
	{
		System.out.println("\nParamiterised constructor...");
		width = w;
		height = h;
		depth = d;
	}

	box(box b2) {
		System.out.println("\nCopy const...");
		width = b2.width;
		height = b2.height;
		depth = b2.depth;
	}

	void display() {
		System.out.println("volume is = " + (width * height * depth));
	}
}

public class constructor {
	public static void main(String[] args) {
		box b1 = new box();
		b1.display();
		box b2 = new box(2, 4, 5);
		b2.display();
		box b3 = new box(b2);
		b3.display();
	}
}
