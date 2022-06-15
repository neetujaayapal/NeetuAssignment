package AssigmentClassAndMethods;



public class RectangleMain {

	public static void main(String[] args) {


		Rectangle rect1 = new Rectangle();

		int length1 = 4;

		int breadth1 = 5;

		int area1 = rect1.area(length1, breadth1);
		System.out.println(" Area of rect 1 =" + area1);

		Rectangle rect2 = new Rectangle();

		int length2 = 5;

		int breadth2 = 8;

		int area2 = rect2.area(length2, breadth2);
		System.out.println(" Area of rect 2 =" + area2);
	}

}
