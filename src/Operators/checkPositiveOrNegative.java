package Operators;

import java.util.Scanner;

public class checkPositiveOrNegative {

	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num =sc.nextInt();
		
		if (num>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative ");
		}
	}

}
