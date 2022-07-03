package ATM;

import java.util.Scanner;

public class MainAtm {

	public static void main(String[] args) {

		Atm atm1 = new Atm();
		Scanner sc = new Scanner(System.in);
		boolean needToContinue = false;

		Person neetu = new Person("Neetu", 123456, 5000, "Chequing", 1234);

		System.out.println("Enter the card number");
		System.out.println("Neetu = Card no-987654 ");

		int cardNo = sc.nextInt();
		boolean isPinCorrect = false;

		switch (cardNo) {

		
		case 987654:
			isPinCorrect = atm1.checkPin(neetu);

			if (isPinCorrect) {

				do {

					int choice;
					System.out.println("Enter the choice to perform");
					System.out.println("1 : Withdraw");
					System.out.println("2 : Deposit");

					choice = sc.nextInt();

					switch (choice) {
					case 1:
						isPinCorrect = atm1.checkPin(neetu);
						if (isPinCorrect == false) {
							System.out.println("Maximum Attempts done");
						} else {
							atm1.withdrawCash(neetu);
							atm1.balance(neetu);
						}
						break;

					case 2:
						isPinCorrect = atm1.checkPin(neetu);
						if (isPinCorrect == false) {
							System.out.println("Maximum Attempts done");
						} else {

							atm1.depositCash(neetu);
							atm1.balance(neetu);
						}

						break;

					default:
						System.out.println("Invalid choice");
						break;
					}

					if (isPinCorrect == false) {
						System.out.println("Check with bank");
					} else
						System.out.println("Do you want to continue transaction");
					needToContinue = sc.nextBoolean();
				} while (needToContinue == true);
			}
				System.out.println("Transaction ended.");
			break;

		default: 
			System.out.println("Invalid card number.Enter a valid card number");
		}
		// }

		sc.close();
	}
}
