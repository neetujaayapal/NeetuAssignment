package Operators;

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter the number");
		number = sc.nextInt();

		int cube = number * number * number;
		System.out.println("Cube value of " + number + "=" + cube);
		
		System.out.println(+cube);
		sc.close();
	}

}
