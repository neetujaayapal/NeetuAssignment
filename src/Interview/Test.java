package Interview;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		
		//1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println("The number is positive");
		}
		
		else if(a<0) {
			
			System.out.println("The number is negative");
		}
		
		//2
		
		int d = 7;
		int b =9;
		int c = 11;
		
		if (d>b && d>c) {
			System.out.println("The largest number is "+d);
		}
		else if (b>d && b>c) {
			System.out.println("The largest number is "+b);
		}
		else {
			System.out.println("The largest number is "+c);
		}
		
		//3
		
		int number = 5;
		
		for (int i = 1;i<=10;i++) {
			System.out.println(+i+ "x" +number+ "=" +i*number);
		}
		
		// 4
		
		int num1 = 78643;
		
		for (int i=1;i<=10;i++) {
			
		}

	}

}
