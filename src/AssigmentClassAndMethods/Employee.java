package AssigmentClassAndMethods;



public class Employee {
	
	/*Create a class Employee. Set the first Name, last name and hourly rate and print the first name, 
	 last name and rate . Add a method which will calculate the weekly salary of the person by taking no 
	 of hours worked as an input and multiplying it to hourly rate and print it.*/
	 
	String firstName;
	String lastName;
	int hourlyRate;

	int salary(int hoursWorked) {

		int weekSalary = hourlyRate * hoursWorked;

		return weekSalary;
	}

}
