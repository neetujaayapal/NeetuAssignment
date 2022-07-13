package StringMethods;

import java.util.Scanner;

public class IndexReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "malayalam";
		System.out.println("a ="+a);
		// converted string to character array
		char[]  arrayOfA = a.toCharArray();
		System.out.println(arrayOfA);
		// replaced all the letters with '_'
		String b =a.replaceAll("[a-zA-Z]", "_");
		
		System.out.println("b ="+b);
		
		// find the index of 'a' in string a
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the letter");
		String letter = sc.next();
		
		
		System.out.println(a.indexOf(letter));
		
		
		// replace index with letter
		
		System.out.println(b.replaceAll("_", letter));
		
		

	}

}
