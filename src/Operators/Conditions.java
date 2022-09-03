package Operators;

public class Conditions {

	public static void main(String[] args) {
		// if you have food and study well,i ll take to park
		
		boolean hadFood = false;
		boolean studied = true;
		
		if (hadFood && studied)
		{
			System.out.println("will go to park");
		}
		else 
		{
			System.out.println("will not go to park");
		}
		
		//either food or study
		
		if (hadFood || studied) {
			
			System.out.println("will go to park");
		}
		else {
			System.out.println("not go to park");
		}
		
		if (!hadFood && studied) {
			
		System.out.println("will go to park");
		
		}
		else {
			System.out.println("not go to park");
		}
		
		// maths and biology, then eligible for entrance exam
		
		String subject1 ="maths";
		String subject2 ="biology";
		
		
		if (subject1.equals("maths") && subject2.equals("biology")) {
			
			System.out.println("eligible for entrance");
			
		}else {
			System.out.println("not eligible");
		}
			}

}
