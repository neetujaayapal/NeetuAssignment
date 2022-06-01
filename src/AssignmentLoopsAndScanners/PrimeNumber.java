package AssignmentLoopsAndScanners;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// program which checks if a number is prime or not.
		// Prime number has only 2 factors
		
		int number = 0;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int factorCount=0;	
		
		for 
		(int i = 1; i<=number; i++) {
		
		
		if (number%i==0) {
				
		factorCount =factorCount+1;
		
		}
		
		}
		System.out.println("Factor Count ="+factorCount);
		if  (factorCount==2) {
				
		System.out.println(+number+ " is a prime number");	
				
        }
		
		else {
			System.out.println(+number+ " is not  a prime number");
		}
           
		
}
			
}	
		
	

