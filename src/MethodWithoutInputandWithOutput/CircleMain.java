package MethodWithoutInputandWithOutput;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {

		Circle circle1 = new Circle();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		circle1.radius = sc.nextInt();

		System.out.println(" Area of Circle =" + circle1.area());
		sc.close();

	}

}
