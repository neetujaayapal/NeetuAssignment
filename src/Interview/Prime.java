package Interview;

public class Prime {

	public static void main(String[] args) {
		
		//Write a program to find if the number is prime or not. 
		
		
	int number = 4;
	
	int factor = 0;
	
	for (int i = 1;i<=number;i++) {
		
		if (number%i ==0) {
		factor = factor+1;
		}
	}

	
	if (factor == 2)
		System.out.println("The number is prime");
	
	
	else {
		System.out.println("The number is not prime");
	}
	}
}
