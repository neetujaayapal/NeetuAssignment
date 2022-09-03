package Operators;

import java.util.Scanner;

public class FindGreatest {

	public static void main(String[] args) {
		int num1 =0;
		int num2 =0;
		int num3 =0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number 1");
		num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		num2 = sc.nextInt();
		System.out.println("Enter the number 3");
		num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println(+num1+ " is the greatest number");
			
		}
		else if (num2>num1 && num2>num3) {
			System.out.println(+num2+ " is the greatest number");
			
		}
		else {
			System.out.println(+num3+ " is the greatest number");
		}
	}

}
