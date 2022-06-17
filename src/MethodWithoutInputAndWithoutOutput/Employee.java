package MethodWithoutInputAndWithoutOutput;

import java.util.Scanner;

public class Employee {

	// Method which does not take input and does not return value
	String firstName;
	String lastName;
	int hourlyRate;
	int noOfHours;
	int weeklySalary;
	Scanner sc = new Scanner(System.in);

	void weeksalary() {
		
		weeklySalary = noOfHours * hourlyRate;
		System.out.println("Weekly Salary = " + weeklySalary);
	}

}
