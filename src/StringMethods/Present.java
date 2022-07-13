package StringMethods;

public class Present {

	public static void main(String[] args) {

		// out of all students check whether jerin is present or not.
		
		//How many jerin 
		String[] students = { "neetu", "jerin", "gurmeen", "rintu","jerin" ,"jerin"};

		int count = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals("jerin")) {
				count+=1;
				

			}
			
			//else {
				//System.out.println("Jerin is not in class");
				//break;
			//}
		}
		System.out.println("Jerin is present");
		System.out.println("Count = "+count);
		

	}

}
