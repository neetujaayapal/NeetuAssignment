package AssigmentClassAndMethods;

import java.util.Scanner;

public class AmusementParkRide {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean newPerson = false;
		Person personInPark = new Person();
		
		
		do {
			
             //boolean isEligibleForRide = personInPark.ableToRide();
			//System.out.println("Is this person allowed to ride =" +isEligibleForRide);
			System.out.println("Is this person allowed to ride = "+personInPark.ableToRide());
			
		
			// if (isEligibleForRide==true) {
				//System.out.println("The person is allowed to board the ride");
			//}
			
			//else {
			//	System.out.println("The person is not allowed to board the ride");
			//}

			System.out.println("Are there new any person ");
			newPerson = sc.nextBoolean();
			
		} while (newPerson == true);

		sc.close();
	}

}
