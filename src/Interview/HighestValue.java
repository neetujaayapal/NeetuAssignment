package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class HighestValue {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numberArray = new int[10];
		
		for (int i = 0;i<numberArray.length;i++) {
			
		System.out.println("Enter the number");
			
	     numberArray[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(numberArray));
		
		
		int highest =  numberArray[0];
		
		for (int i =0;i<numberArray.length;i++) {
		
		if (numberArray[i]>highest) {
			
			highest = numberArray[i];}}
		
		System.out.println(highest);
		
		

	}

}
