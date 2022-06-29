package ATM;

import java.util.Scanner;

public class MainAtm {

	public static void main(String[] args) {

		Atm atm1 = new Atm();
		Scanner sc = new Scanner(System.in);

		Person neetu = new Person("Neetu", 123456, 5000, "Chequing");

		atm1.checkPin();
		String operation;
		operation = sc.next();
		

		if (operation.equals("withdraw")) {

			atm1.withdrawCash(neetu);
			
		}

		else if (operation.equals("deposit")) {

			atm1.depositCash(neetu);
	
		}
		System.out.println("Transaction ended.Please take your card");
		sc.close();
	}
}
