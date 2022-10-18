package Interview;

public class StringASubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// program to find if a string is a substring of another String.
		
		String s1 = " My name is neetu";
		
		String s2 = "home";
	
		boolean isSubstring = s1.contains(s2)	;
		
		if (isSubstring ) {
			
			System.out.println("s2 is substring of s1");
		}
		
		else {
			
			System.out.println("Not a substring");
		}
			
		
	}

}
