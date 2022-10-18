package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Smallest number in array

		/*
		 * int[] numbers = new int[5];
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * for (int i = 0;i<numbers.length;i++) {
		 * 
		 * System.out.println("Enter the number");
		 * 
		 * numbers[i]= sc.nextInt(); } System.out.println(Arrays.toString(numbers));
		 * 
		 * int smallest = numbers[0];
		 * 
		 * for (int i = 0; i<numbers.length;i++) {
		 * 
		 * if (numbers[i]< smallest) {
		 * 
		 * smallest = numbers[i]; }
		 * 
		 * 
		 * } System.out.println("smallest ="+smallest);
		 */

		// find the sum of array

		int[] numbers = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Enter the number");

			numbers[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));

		/*
		 * int sum = 0;
		 * 
		 * for (int i = 0;i<numbers.length;i++) {
		 * 
		 * sum = sum + numbers[i]; }
		 * 
		 * System.out.println("Sum = "+sum);
		 */

	}

}
