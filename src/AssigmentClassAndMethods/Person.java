package AssigmentClassAndMethods;

import java.util.Scanner;

public class Person {
	// attributes

	double height;
	double weight;

	// method

	Scanner sc = new Scanner(System.in);

	boolean ableToRide() {
		System.out.println("Enter the height");
		double height = sc.nextDouble();
		System.out.println("Enter the weight");
		double weight = sc.nextDouble();
		
		if ((height < 90) || (height > 200 || weight < 15 || weight > 95)) {

			System.out.println("Not eligible to ride");
			return false;

		}

		else {
			System.out.println("Eligible to ride");
			return true;

		}

	}
}
