package practiseProblems;

import java.util.Scanner;

public class DoWhileLogin {

	public static void main(String[] args) {
		String username = "123@gmail.com";
		int password = 123;
		
		String requiredUsername = "1234@gmail.com";
		int requiredPassword = 1234;
		
		Scanner sc = new Scanner (System.in);
				
		int maxAllowedAttempts = 3;
		int enteredAttempts = 2;
		
		do {
			System.out.println("Enter the username");
			username = sc.next();
			System.out.println("Enter the password");
			password = sc.nextInt();
			
			if (username.equals(requiredUsername)&& password==requiredPassword) {
				System.out.println("Login Successsfull");
			}
			System.out.println("Enter the no of attempts");
			enteredAttempts = sc.nextInt();
			
			if ()
		
			
		}
				
			
				

	}

}
