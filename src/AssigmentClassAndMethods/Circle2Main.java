package AssigmentClassAndMethods;

import java.util.Scanner;

public class Circle2Main {

	public static void main(String[] args) {

		Circle2 circle1 = new Circle2();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the radius");
		circle1.radius = sc.nextInt();
		
		
		
		
		circle1.area();

	}

}
