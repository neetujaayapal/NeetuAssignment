package AssigmentClassAndMethods;



public class RectangleMain {

	public static void main(String[] args) {


		Rectangle rect1 = new Rectangle();

		rect1.length = 4;

		rect1.breadth = 5;

		int area1 = rect1.area(rect1.length,rect1.breadth);
		System.out.println(" Area of rect 1 =" + area1);

		Rectangle rect2 = new Rectangle();

		rect2.length = 5;

		rect2.breadth = 8;

		int area2 = rect2.area(rect2.length,rect2.breadth);
		System.out.println(" Area of rect 2 =" + area2);
	}

}
