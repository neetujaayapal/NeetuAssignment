package Interview;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// how to reverse a string
		
		String name = "canada";
		
//		StringBuffer str = new StringBuffer(name);
//		
//		System.out.println(str.reverse());
		
	//	String reversename = str.reverse().toString();
		
	//	System.out.println(reversename);
		
		// or
		
		char[] charArray = name.toCharArray();
		
		for (int i = charArray.length-1;i>=0;i--) {
			
			System.out.println(name.charAt(i));
			
			
		}
		
		//or
		
//		int length = name.length();
//		
//		System.out.println(length);
//		
//		String rev = "";
//		
//		for (int i = length-1;i>=0;i--) {
//			
//			rev = rev+name.charAt(i);
//		}
//System.out.println(rev);
	}

}
