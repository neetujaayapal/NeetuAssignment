package AssigmentClassAndMethods;


public class AmusementParkRide {
	
	String parkName;


	boolean isEligibleForRide (double height,double weight) {
		
		if(height< 90 || height > 200 || weight < 15 || weight > 95) {
			
			System.out.println("The person is not  eligible to board the ride");
			return false;
			
			
		}
		else
			System.out.println("The person is eligible to board the ride");
		return true;
		
	}
	}
