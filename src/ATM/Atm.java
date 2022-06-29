package ATM;

import java.util.Scanner;

public class Atm {

	final double cashLimit;
	private int enteredPin;

	public Atm() {
		cashLimit = 3000;
	}

	Scanner sc = new Scanner(System.in);

	Person neetu = new Person("Neetu", 123456, 5000, "Chequing");

	void checkPin() {

	
		for (int i = 1; i <=3; i++) {
			System.out.println("Enter the pin");
			enteredPin = sc.nextInt();
			if (enteredPin == neetu.usePin()) {
				System.out.println("Enter the operation to perform");
				break;
			} else {
				System.out.println("Incorrect Pin.Enter the pin again");
			}

			if (i == 3) {
				System.out.println("ATM Blocked");
			}
		}

	}

	double depositCash(Person neetu) {

		System.out.println("Enter the amount to deposit.");
		double deposit = sc.nextDouble();
		System.out.println("Insert cash");

		double balanceAfterdeposit = neetu.balance + deposit;
		System.out.println("Current Balance = " + balanceAfterdeposit);

		return balanceAfterdeposit;

	}

	double withdrawCash(Person neetu) {

		System.out.println("Enter the amount to withdraw");
		double withDrawAmount = sc.nextDouble();
		double currentBalance = neetu.balance - withDrawAmount;
		if (withDrawAmount <= cashLimit) {
			if (withDrawAmount <= neetu.balance) {
				System.out.println("Please collect the cash");

			} else {
				System.out.println("Insufficient balance");
			}

			System.out.println("Current Balance = " + currentBalance);

		} else {
			System.out.println("Amount is greater than daily transaction limit");
		}
		return currentBalance;
	}

}
