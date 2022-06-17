package MethodWithInputandWithOutput;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Circle circle1 = new Circle(); // Object is created

		System.out.println("Enter the radius");
		int radius = sc.nextInt();
		double radiusOfCircle = circle1.area(radius);

		System.out.println("Area of circle = " + circle1.area(radius));
		System.out.println(" Area = " + radiusOfCircle);

		sc.close();

	}

}
