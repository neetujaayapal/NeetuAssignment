package AssigmentClassAndMethods;

import java.util.Scanner;

public class Employee1Main {

	public static void main(String[] args) {

		Employee1 emp = new Employee1();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Name");
		emp.firstName = sc.next();
		System.out.println("Enter the last Name");
		emp.lastName = sc.next();
		System.out.println("Enter the hourly salary");
		emp.hourlyRate = sc.nextInt();

		System.out.println("First Name =" + emp.firstName);
		System.out.println("Last Name =" + emp.lastName);
		System.out.println("Hourly Rate =" + emp.hourlyRate);

		System.out.println("Weekl y Salary = " + emp.weeksalary());
		sc.close();

	}

}
