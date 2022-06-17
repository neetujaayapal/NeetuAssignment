package AssigmentClassAndMethods;

public class Rectangle1Main {

	public static void main(String[] args) {


		Rectangle1 rect1 = new Rectangle1();
		
		rect1.length = 4;
		rect1.breadth = 5;
		
		System.out.println("Area = "+rect1.area());
		
       Rectangle1 rect2 = new Rectangle1();
		
		rect2.length = 5;
		rect2.breadth = 8;
		
		System.out.println("Area = "+rect2.area());
		

	}

}
