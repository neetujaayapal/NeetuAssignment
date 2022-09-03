package Operators;

public class DisplayTenNaturalNumbers {

	public static void main(String[] args) {


        int fact = 1;
		int sum = 0;
		for (int startNumber = 1; startNumber<=10;startNumber++) {
			System.out.println(startNumber);
			sum = sum+startNumber;
			fact = fact*=startNumber;
		}
		System.out.println("Sum ="+sum);
		System.out.println("Factorial = "+fact);
	}

}
