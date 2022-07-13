package StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String s1 ="Welcome";
		
		String s2 = "Home";
				
		// Length
		
		System.out.println(s1.length());
		
		//concatenation
		
		System.out.println(s1.concat (s2));
		
		//String to CharArray()-This method is used to convert all the characters of a string into a Character Array/
		
		char[] characterarray = s1.toCharArray();
		System.out.println(characterarray);
		
		for(int i =0;i<characterarray.length;i++) {
			
			System.out.println(characterarray[i]);
		}
	    // String contains() - check whether any particular character or letter is in string or not
		
		System.out.println(s1.contains("el"));
		
		//String replace() - method used to replace characters by other character
		
		System.out.println(s1.replace('W','e'));
		
		//Substring Method() - used to return substring of main string by specifying the starting and ending 
		//index of main string
		
	    System.out.println(s1.substring(0,2));
	}

}
