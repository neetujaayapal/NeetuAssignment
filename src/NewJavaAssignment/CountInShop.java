package NewJavaAssignment;

import java.util.Scanner;

public class CountInShop {

	public static void main(String[] args) {

		int maxCapacity = 50;     // maximum capacity inside the store
		int entryCount = 0;     
		System.out.println("No of people entering the store");
		Scanner sc = new Scanner(System.in);
		entryCount = sc.nextInt();
		
		int peopleInsideStore = 0;     
		System.out.println("No of people inside the store");
		peopleInsideStore=sc.nextInt();
		System.out.println("Number of people in store currently:"+peopleInsideStore);
		
		while(peopleInsideStore <= maxCapacity) {
			if(entryCount==0)
			{
				 break;
			}
			peopleInsideStore +=entryCount;
			System.out.println("No. of people trying to enter the store: "+entryCount);
			
			if(peopleInsideStore >=50)
			{
				if(peopleInsideStore >50)
				{
					System.out.println("Cannot allow to enter all !!!\n" + (peopleInsideStore-50) + " people will have to wait ");
				}
				peopleInsideStore = 50;
				System.out.println("Maximum Capacity Reached");
				System.out.println("Number of people in the store: "+peopleInsideStore);
				break;
			}
		    System.out.println("Number of people in store currently:"+peopleInsideStore);
	}
		sc.close();
            }
            }
