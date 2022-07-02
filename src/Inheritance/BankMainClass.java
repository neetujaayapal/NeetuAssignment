package Inheritance;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {

		Chequing chqAccount = new Chequing();
		chqAccount.depositMoney(1000);

		Savings svngAccount = new Savings();
		svngAccount.depositMoney(100);

		Tfsa tfsa = new Tfsa();
		tfsa.depositMoney(5000);

		System.out.println("Balance in chequing : " + chqAccount.balance);

		System.out.println("Balance in Saving : " + svngAccount.balance);

		System.out.println("Balance in TFSA : " + tfsa.balance);

		
	
		Scanner sc = new Scanner (System.in);
		if (chqAccount.authorization(1234, "Chequing") ) {

			System.out.println("Welcome to the Chequing Home Page");
			System.out.println("Enter the withdraw amount");
			double withdrawAmount = sc.nextDouble();
			chqAccount.withdraw(withdrawAmount);
			System.out.println("Balance of chequing account = "+chqAccount.balance);
		} else {
			System.out.println("Cannot access to chequing account");
			
		}
		
		
		
		
		if (svngAccount.authorization(3456,"Saving") ) {
			
			System.out.println("Able to access saving account =" + svngAccount.authorization(3456, "Saving"));
		} else {
			System.out.println("Cannot access to savings account");
		}
		if (tfsa.authorization(6666, "TFSA")) {

			System.out.println("Able to access TFSA account = " + tfsa.authorization(6666, "TFSA"));
		} else {
			System.out.println("Cannot access to TFSA account");
		}
		}
		
	
}
