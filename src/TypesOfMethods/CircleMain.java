package TypesOfMethods;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Circle circle1 = new Circle();
		circle1.radius = 0;
		System.out.println("Enter the radius");
		circle1.radius = sc.nextDouble();

		double radiusOfCircle = circle1.area(circle1.radius);

		System.out.println("Area of circle = " + circle1.area(circle1.radius));
		System.out.println(" Area = " + radiusOfCircle);

		sc.close();

	}

}
