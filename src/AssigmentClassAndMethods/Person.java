package AssigmentClassAndMethods;

import java.util.Scanner;

public class Person {
	/*Create a Amusement park ride class  which checks if the person is allowed to board the ride or not .
	Create a person class with variable height and weight . Height<90 cm and more than 200 cm is not allowed. 
	Weight < 15 kg and more than 95 kg is not allowed. While checking eligibility to ride, use the person class variables.*/

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
		
				
		if ((height < 90) || (height > 200) || (weight < 15 || weight > 95)) {

			System.out.println("Not eligible to ride");
			return false;
		}
		/*else if ((weight < 15 || weight > 95)) {

				System.out.println("Not eligible to ride");
				return false;
			
		}*/

		else {
			System.out.println("Eligible to ride");
			return true;

		}

	}
}
