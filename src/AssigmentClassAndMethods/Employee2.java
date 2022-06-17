package AssigmentClassAndMethods;

import java.util.Scanner;

//Method which does not take input and does not return value
public class Employee2 {
	
	String firstName;
	String lastName;
	int hourlyRate ;
    int weeklySalary; 
    Scanner sc = new Scanner(System.in);
    void weeksalary() {
    	
    	
		int noOfHours = 0;
		System.out.println("Enter the no. of hours");
		noOfHours = sc.nextInt();
		weeklySalary = noOfHours*hourlyRate;
		System.out.println("Weekly Salary = "+weeklySalary);
	}

}
