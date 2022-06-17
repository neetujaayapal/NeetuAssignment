package AssigmentClassAndMethods;

import java.util.Scanner;

public class Employee1 {
	
	/*Create a class Employee. Set the first Name, last name and hourly rate and print the first name, 
	 last name and rate . Add a method which will calculate the weekly salary of the person by taking no 
	 of hours worked as an input and multiplying it to hourly rate and print it.*/

	//Method which does not take input but returns a value or output.
	String firstName;
	String lastName;
	int hourlyRate ;
    int weeklySalary; 
	Scanner sc = new Scanner(System.in);
	
	
	int weeksalary() {
		int noOfHours = 0;
		System.out.println("Enter the no. of hours");
		noOfHours = sc.nextInt();
		weeklySalary = noOfHours*hourlyRate;
		return weeklySalary;
	}
	
	
	
}
