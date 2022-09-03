package Operators;

import java.util.Arrays;
import java.util.Scanner;

public class DaysInAWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int num =0;
        System.out.println("Enter the number");
        num = sc.nextInt();

	
	switch (num) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
		
	default:
		System.out.println("Enter a valid input");
	}
	
	

	}

}
