package AssigmentClassAndMethods;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean needToCheck = false;
		Employee emp = new Employee();

		do {
			System.out.println("Enter the first Name");
			emp.firstName = sc.next();
			System.out.println("Enter the second Name");
			emp.lastName = sc.next();
			System.out.println("Enter the hourly rate");
			emp.hourlyRate = sc.nextInt();

			System.out.println("First name =" + emp.firstName);
			System.out.println("Second Name =" + emp.lastName);
			System.out.println("Hourly Rate =" + emp.hourlyRate);

			System.out.println("Enter the no. of hours worked");
			int empHours = sc.nextInt();

			int weekSalary = emp.salary(empHours);
			System.out.println("Weekly salary ="  +weekSalary);

			System.out.println("Do you want to check other employee salary");
			needToCheck = sc.nextBoolean();
		}

		while (needToCheck == true);
		sc.close();
	}
}
