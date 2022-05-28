package RevisedNewJavaAssignment;

public class Count {

	public static void main(String[] args) {
		int maxCapacity = 50;
		int currentCapacity = 25;
		int enterCount = 2;
		int exitCount = 1;
		int peopleInsideStore = currentCapacity+(enterCount-exitCount);

		// current capacity +(enter count - exit count ) should not be greater than
		// 50.If so display max capacity reached
		 	
		while (peopleInsideStore < maxCapacity) {
			
		System.out.println("People can still enter the store");
		System.out.println("People inside the store="+peopleInsideStore);
		peopleInsideStore+=enterCount-=exitCount; 
			
		
				
	    if (peopleInsideStore >= maxCapacity) {
			break;
	    }
	    }
		if (peopleInsideStore >= maxCapacity) {
		System.out.println("Maximum Capacity Reached");
		}
		
	}



	}


