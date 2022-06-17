package AssigmentClassAndMethods;

public class Rectangle2Main {

	public static void main(String[] args) {

		Rectangle2 rect1 = new Rectangle2();

		rect1.length = 4;
		rect1.breadth = 5;


		Rectangle1 rect2 = new Rectangle1();

		rect2.length = 5;
		rect2.breadth = 8;

		rect1.area();
		rect2.area();

	}

}
