package Interview;

import java.util.Scanner;

public class ReplaceNumbersWithAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to replace the numbers in an array with alphabets.

		String numbers = "1234";

		System.out.println(numbers.replaceAll("1234", "[A-Za-z]"));
		
		System.out.println(numbers);

	}

}
