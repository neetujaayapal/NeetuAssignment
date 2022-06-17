package MethodWithoutInputandWithOutput;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();

		rect1.length = 4;
		rect1.breadth = 5;

		System.out.println("Area = " + rect1.area());

		Rectangle rect2 = new Rectangle();

		rect2.length = 5;
		rect2.breadth = 8;

		System.out.println("Area = " + rect2.area());

	}

}
