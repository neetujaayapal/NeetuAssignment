package MethodWithoutInputandWithOutput;

import java.util.Scanner;

public class TraingleMain {

	public static void main(String[] args) {

		Triangle tria1 = new Triangle();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base length");
		tria1.base = sc.nextDouble();
		System.out.println("Enter the height");
		tria1.height = sc.nextDouble();

		System.out.println("Area = " + tria1.area());
		sc.close();
	}

}
