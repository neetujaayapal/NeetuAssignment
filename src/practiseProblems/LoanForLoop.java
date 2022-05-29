package practiseProblems;

import java.util.Scanner;

public class LoanForLoop {

	public static void main(String[] args) {
		double loanamount = 0;
		System.out.println("Enter the loan amount");
		
		Scanner sc = new Scanner(System.in);
		loanamount = sc.nextDouble();
		
		for (int month  =1; month <=3 ; month++) {
		
	    double monthlyPayment = 0.10*loanamount;
	    
	    loanamount= loanamount-monthlyPayment;
	    }
				
		System.out.println("Remaining Amount to pay after 3 months ="+loanamount);
		sc.close();

	}

}
