package Operators;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int year = 0;
     System.out.println("Enter the year");
     year = sc.nextInt();
     
     if (year%4 ==0) {
    	 System.out.println(+year+ " is a leap year");
     }
     else {
    	 System.out.println(+year+ " is not a leap year");
     }

	}

}
