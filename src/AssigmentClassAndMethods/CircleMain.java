package AssigmentClassAndMethods;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Circle circle1 = new Circle();
		int radius;
		System.out.println("Enter the radius");
		radius = sc.nextInt();

		//
		circle1.area(radius);

		System.out.println("Area of circle = " + circle1.area(radius));

		sc.close();

	}

}
