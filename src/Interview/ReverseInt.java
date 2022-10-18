package Interview;

import java.util.Arrays;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 4322183;
		
		int rev = 0;
		
		while (number!= 0) {
			
			rev = rev*10+number%10;
			
			number = number/10;
		}
		
		System.out.println(rev);
		
		
		int n = 7642145;
		System.out.println(new StringBuffer(String.valueOf(n)).reverse());
		
	   int nu = 72543;
	   
	   
		
	}

}
