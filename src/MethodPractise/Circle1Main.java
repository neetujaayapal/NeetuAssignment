package MethodPractise;

import java.util.Scanner;

public class Circle1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Circle1 circle = new Circle1();
		System.out.println("Enter the radius");
	    int radius = sc.nextInt();

		double radiusOfCircle = circle.area(radius);

		System.out.println("Area of circle = " + circle.area(radius));
		System.out.println(" Area = " + radiusOfCircle);

		sc.close();


	}

}
