package Operators;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter the number");
		number = sc.nextInt();
		
		for (int i = 1; i<=20;i++) {
			System.out.println(+number+ "x" +i+ "=" +(number*i));
		}

	}

}
