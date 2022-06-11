package AssignmentSwitchAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int firstNumber = 0;
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		firstNumber = sc.nextInt();
		int secondNumber = 0;
		System.out.println("Enter the second number");
		secondNumber = sc.nextInt();
		boolean needToContinue = false;
    	
    	
        do {
        	
        	String operation = "";
    		System.out.println("Enter the operator");

    		operation = sc.next();
            
		switch (operation) {
		case "+":
			
			System.out.println(+firstNumber+ " + "+secondNumber+ " = " +(firstNumber+secondNumber) );
			break;
     
		case "-":
			
			System.out.println(+firstNumber+ " - "+secondNumber+ " = " +(firstNumber-secondNumber) );
			break;

		case "*":
			
			System.out.println(+firstNumber+ " * "+secondNumber+ " = " +(firstNumber*secondNumber) );
			break;
			
		case "/":
			
			System.out.println(+firstNumber+ " / "+secondNumber+ " = " +(firstNumber/secondNumber) );
			break;
		
		default:
			
			System.out.println("Enter any mathematical operation (+,-,*,/) to execute the program");
		}
		System.out.println("Do you want to continue");
		needToContinue = sc.nextBoolean();
        }
        
        while (needToContinue == true);
        
        
  
		sc.close();
  
	}

}
