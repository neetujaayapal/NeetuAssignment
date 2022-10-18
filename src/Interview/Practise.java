package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// check the vowel

		// String name = "Welcome";

//		String name = "jklm";
//
//		int count = 0;
//
//		for (int i = 1; i <= name.length(); i++) {
//
//			if (name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o")
//					|| name.contains("u")) {
//
//				count++;
//
//			}
//
//			else {
//				System.out.println("Letter does not contain vowels");
//				break;
//
//			}
//
//		}
//		System.out.println("The string contains vowels");
//
//		System.out.println(count);
//		
//		 	// Smallest number in array
//		
//		int[] numberArray = new int[5];
//		
//		
//		
//		for (int i = 0;i<numberArray.length;i++) {
//			
//			System.out.println("Enter the number");
//			
//			numberArray[i]=sc.nextInt();
//			
//		}
//		
//		System.out.println(Arrays.toString(numberArray));
//		
//		int smallest = numberArray[0];
//		
//		for(int i = 0;i<numberArray.length;i++) {
//			
//			if (numberArray[i]<smallest) {
//				
//				smallest=numberArray[i];
//			}
//		}
//		
//		System.out.println("The smallest number is "+smallest);
//		
//		int highest = numberArray[0];
//		
//		for (int i = 0;i<numberArray.length;i++) {
//			
//			if(numberArray[i]>highest) {
//				
//				highest=numberArray[i];
//			}
//		}
//		
//		System.out.println("Highest number is "+highest);

		// arrange the number in ascending and descending order

//		int[] array = {34,65,87,12,9};
//		
//		Arrays.sort(array);
//		
//		// printing in ascending order
//		
//		System.out.println(Arrays.toString(array));
//		
//	 for(int i = array.length-1;i>=0;i--) {
//		 
//		 // printing in descending
//		 
//		 System.out.println(array[i]);
//	 }
//	 
//	 System.out.println(Arrays.toString(array));

		// check whether a number is prime or not

		//int number = 0;
//		
//		System.out.println("Enter the number");
//		
//		number = sc.nextInt();
//		
//		int factor = 0;
//		
//		for (int i = 1;i<=number;i++) {
//			
//			if(number%i == 0) {
//				factor++;
//			}
//		}
//			if(factor==2) {
//				
//				System.out.println("Number is prime");
//			}
//			
//			else {
//				
//				System.out.println("Number is not prime");
//			
//			}

		// remove junk characters

//		String letter = "#@^&*$ERDS";
//		
//		String junkRemovedLetter = letter.replaceAll("[^a-zA-Z0-9]", "");
//		
//		System.out.println(junkRemovedLetter);

		// REVERSE AN ARRAY

//		String[] name = { "neetu", "dinu", "vihaan", "vishnu" };
//
//		for (int i = name.length - 1; i >= 0; i--) {
//
//			System.out.println(name[i]);
//		}
//
//		Collections.reverse(Arrays.asList(name));
//
//		System.out.println(Arrays.toString(name));
		
		// reverse a string
		
		String name = "neetu";
		
//		StringBuffer string = new StringBuffer(name);
//		
//		System.out.println(string.reverse());
		
		char[] charArray = name.toCharArray();
		
		for (int i = charArray.length-1;i>=0;i--) {
			
			System.out.println(charArray[i]);
		}
	
		
		System.out.println(Arrays.toString(charArray));
		

	}

}
