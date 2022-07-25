package Interview;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to reverse a string and check if it is a palindrome.
		String name = "malayalam";

		char[] namearray = name.toCharArray();

		System.out.println(namearray);

		System.out.println(name.indexOf("l"));

		System.out.println(name.lastIndexOf("l"));

		String rev = "";

		System.out.println(namearray.length);

		//System.out.println(name.charAt(0));
		
		/*for(int i = 0; i<namearray.length;i++) {
			
			System.out.println(name.charAt(i));
		}*/
		
		for ( int i = namearray.length-1;i>=0;i--) {
			
			System.out.println("Reverse ="+name.charAt(i));
		
		}
		
		

		
	}

}
