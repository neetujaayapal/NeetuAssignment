package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// average of an array
		
		int[] number = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i< number.length;i++) {
			
			System.out.println("Enter the number");
			
			number[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(number));
		
	/*	int sum = 0;
		
		int average = 0;
		
		for (int i = 0;i<number.length;i++) {
			
			sum = sum+number[i];
			
			
		}
		
		average = sum / number.length;
		
		System.out.println("Average ="+average);*/
		
		// add elements to array
		
		

	}

}
