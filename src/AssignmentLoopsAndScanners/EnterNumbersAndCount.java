package AssignmentLoopsAndScanners;

import java.util.Scanner;

public class EnterNumbersAndCount {

	public static void main(String[] args) {
		// program to enter the numbers till the user wants and at the
		// end it should display the count of numbers entered.

		int number = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		number = sc.nextInt();

		String needToEnterNumber = ""; // yes or no

		int count = 1;
		System.out.println("Do you want to enter another number");
		needToEnterNumber = sc.next();

		while (needToEnterNumber.equals("yes")) {
			System.out.println("Enter another number");
			number = sc.nextInt();
			count = count + 1;
			System.out.println("Do you want to enter another number");
			needToEnterNumber = sc.next();

			if (needToEnterNumber.equals("no")) {

				break;
			}

		}
		System.out.println("Count =" + count);
		sc.close();
	}
}
