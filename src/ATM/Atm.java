package ATM;

import java.util.Scanner;

public class Atm {

	final double cashLimit;
	int enteredPin;

	public Atm() {
		cashLimit = 5000;
	}

	Scanner sc = new Scanner(System.in);


	void checkPin(Person person) {
		

		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the ATM pin");
			enteredPin = sc.nextInt();
			if (enteredPin == person.usePin() ) {
				break;
			}
			
			else if (enteredPin !=person.usePin())  {
				System.out.println("Incorrect Pin");
			}


			if (i == 3) {
				System.out.println("ATM Blocked");
				
			}
			

		}

	}
	


	double depositCash(Person person) {
		System.out.println("Enter the amount to deposit");
		double deposit = sc.nextDouble();
		person.balance = person.balance + deposit;
		System.out.println("cash deposited");
       System.out.println("Balance = "+person.balance);
		return person.balance;
	}

	double withdrawCash(Person person) {

		System.out.println("Enter the amount to withdraw");
		double withDrawAmount = sc.nextDouble();

		if (withDrawAmount <= cashLimit) {
			if (withDrawAmount <= person.balance) {
				System.out.println("Please collect the cash");
				person.balance = person.balance - withDrawAmount;
				 System.out.println("Balance = "+person.balance);
			} else {
				System.out.println("Insufficient balance");
			}

		} else {
			System.out.println("Amount is greater than daily cash limit");

		}
		return person.balance;
	}

	double balance(Person person) {

		return person.balance;
	}

	

}
