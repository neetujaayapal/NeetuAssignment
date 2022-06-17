package MethodWithInputandWithOutput;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangle tria1 = new Triangle();

		tria1.base = 5;

		System.out.println("Base of the triangle = " + tria1.base);
		System.out.println("Enter the height");
		double height = sc.nextDouble();
		
        double area = tria1.area(height);
        System.out.println(" Area = "+tria1.area(height));
		
		System.out.println("Area of triangle =" +area);
		sc.close();

	

	}

}
