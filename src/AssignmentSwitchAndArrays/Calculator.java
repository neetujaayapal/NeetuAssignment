package AssignmentSwitchAndArrays;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int firstNumber = 0;
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		firstNumber = sc.nextInt();
		int secondNumber = 20;
		System.out.println("Enter the second number");
		secondNumber = sc.nextInt();

		String operation = "";
		System.out.println("Enter the operator");

		operation = sc.next();

		switch (operation) {
		case "addition":
			int sum = firstNumber + secondNumber;
			System.out.println("First Number+ Second Number =" + sum);

			break;

		case "substraction":
			int substraction = firstNumber - secondNumber;
			System.out.println("First Number - Second Number =" + substraction);
			break;

		case "multiply":
			int multiply = firstNumber * secondNumber;
			System.out.println("First Number * Second Number = " + multiply);
			break;
		case "divide":
			int divide = firstNumber / secondNumber;
			System.out.println("First Number / Second Number = " + divide);
			break;
		default:
			System.out.println("Enter a valid operation");
		}
		sc.close();

	}

}
