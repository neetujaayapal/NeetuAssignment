package AssigmentClassAndMethods;

import java.util.Scanner;

public class Circle1Main {

	public static void main(String[] args) {

		Circle1 circle1 = new Circle1();

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the radius");
		circle1.radius = sc.nextInt();
		
		System.out.println(" Area of Circle ="+circle1.area());

	}

}
