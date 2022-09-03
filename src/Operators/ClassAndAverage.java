package Operators;

import java.util.Scanner;

public class ClassAndAverage {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        
        int sum = 0;
        int avg = 1;
        
        int count = 0;
        System.out.println("How many numbers to enter");
        count = sc.nextInt();
        
        for (int i = 1;i<=count;i++) {
        	int num =0;
            System.out.println("Enter the number");
            num = sc.nextInt();
        	sum = sum+=i;
        	
        }
        
        System.out.println("Sum = "+sum);
        
        avg = sum/count;
        System.out.println("Average= "+avg);
	}

}
