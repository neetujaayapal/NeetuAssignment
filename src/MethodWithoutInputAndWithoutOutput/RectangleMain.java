package MethodWithoutInputAndWithoutOutput;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();

		rectangle1.length = 4;
		rectangle1.breadth = 5;

		Rectangle rectangle2 = new Rectangle();

		rectangle2.length = 5;
		rectangle2.breadth = 8;

		rectangle1.area();
		rectangle2.area();

	}

}
