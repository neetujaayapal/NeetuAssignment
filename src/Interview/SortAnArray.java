package Interview;

import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program to sort an array of number

		int[] numbers = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Enter number");

			numbers[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(numbers));

		System.out.println("Sorting in ascending");

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);

		}

		System.out.println(Arrays.toString(numbers));
		
		int largest =numbers[ numbers.length-1];
		
		System.out.println("Largest ="+largest);
		
		int secondLargest = numbers[numbers.length -2];
		
		System.out.println("Second Largest ="+secondLargest);

		System.out.println("Sorting in descending");

		for (int i = numbers.length-1; i >= 0; i--) {

			System.out.println(numbers[i]);
		}

		System.out.println(Arrays.toString(numbers));
	}

}
