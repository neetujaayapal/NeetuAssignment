package ATM;

import java.util.Scanner;

public class MainAtm {

	public static void main(String[] args) {

		Atm atm1 = new Atm();
		Scanner sc = new Scanner(System.in);
		boolean needToContinue = false;

		Person neetu = new Person("Neetu", 123456, 5000, "Chequing", 1234);

		Person teenu = new Person("Teenu", 243456, 8000, "Chequing", 2345);

		Person john = new Person("John", 234567, 6000, "Chequing", 2012);

		
		System.out.println("Enter the card number");
		System.out.println("Neetu = Card no-987654 ");
		System.out.println("Teenu = Card no-432156 ");
		System.out.println("John = Card no-765432 ");
		int cardNo = sc.nextInt();
		
		switch (cardNo) {

		case 987654:
			
			atm1.checkPin(neetu);
			if (atm1.enteredPin != neetu.usePin()) 
				System.out.println("Check with bank");

			else 
			
			do {

				int choice;
				System.out.println("Enter the neetu choice to perform");
				System.out.println("1 : Withdraw");
				System.out.println("2 : Deposit");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					atm1.checkPin(neetu);
				if (atm1.enteredPin != neetu.usePin()) 
					System.out.println("Check with bank");

				else 
						atm1.withdrawCash(neetu);
						atm1.balance(neetu);			
					break;

				case 2:
					atm1.checkPin(neetu);
					if (atm1.enteredPin != neetu.usePin()) 
						System.out.println("Check with bank");

					 else
					
						atm1.depositCash(neetu);
						atm1.balance(neetu);
					
					break;

				default:
					System.out.println("Invalid choice");

				}
				if (atm1.enteredPin != neetu.usePin()) {
					System.out.println("Ended");
				} else
					System.out.println("Do you want to continue transaction");
				needToContinue = sc.nextBoolean();

			} while (needToContinue == true);

			System.out.println("Transaction ended.");

			break;

		case 432156:
			atm1.checkPin(teenu);
			if (atm1.enteredPin != teenu.usePin())
				System.out.println("Ended");
			else

			do {

				System.out.println("Enter the choice to perform");
				System.out.println("1 : Withdraw");
				System.out.println("2 : Deposit");
				int choice;
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					atm1.checkPin(teenu);
					if (atm1.enteredPin != teenu.usePin()) {
						System.out.println("Check with bank");

					} else {
						atm1.withdrawCash(teenu);
						atm1.balance(teenu);
					}
					break;

				case 2:
					atm1.checkPin(teenu);

					if (atm1.enteredPin != teenu.usePin()) {
						System.out.println("Check with bank");

					} else {
						atm1.depositCash(teenu);
						atm1.balance(teenu);
						
					}
					break;

				default:
					System.out.println("Invalid choice");

				}
				if (atm1.enteredPin != teenu.usePin()) {
					System.out.println("Ended");
				} else

					System.out.println("Do you want to continue transaction");
				needToContinue = sc.nextBoolean();

			}

			while (needToContinue == true);

			System.out.println("Transaction ended.Please take your card");

			break;

		case 765432:
			atm1.checkPin(john);
			if (atm1.enteredPin != john.usePin())
				System.out.println("Ended");
			else

			do {
				int choice;
				System.out.println("Enter the choice to perform");
				System.out.println("1 : Withdraw");
				System.out.println("2 : Deposit");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					atm1.checkPin(john);
					if (atm1.enteredPin != john.usePin()) {
						System.out.println("Check with bank");

					} else {
						atm1.withdrawCash(john);
						atm1.balance(john);
					}
					break;

				case 2:
					atm1.checkPin(john);

					if (atm1.enteredPin != john.usePin()) {
						System.out.println("Check with bank");

					} else {
						atm1.depositCash(john);
						atm1.balance(john);
					}
					break;

				default:
					System.out.println("Invalid choice");

				}
				if (atm1.enteredPin != john.usePin()) {
					System.out.println("Ended");
				} else

					System.out.println("Do you want to continue transaction");
				needToContinue = sc.nextBoolean();

			}

			while (needToContinue == true);

			System.out.println("Transaction ended.Please take your card");

			break;

		default:

			System.out.println("Invalid card number.Enter a valid card number");

		}

		sc.close();
	}
}
