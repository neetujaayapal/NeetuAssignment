package ClassPrograms;

public class StudentMain {

	public static void main(String[] args) {

		Student neetu = new Student();
		neetu.name = "Neetu";
		neetu.maths = 90;
		neetu.biology = 85;
		neetu.english = 80;
		neetu.physics = 70;
		neetu.social = 75;
		
		System.out.println("Percentage of Neetu = "+neetu.calculatePercentage());
		
		Student sam = new Student();
		sam.name = "Sam";
		sam.maths = 95;
		sam.biology = 95;
		sam.english = 90;
		sam.physics = 70;
		sam.social = 85;


		System.out.println("Percentage of Sam = "+sam.calculatePercentage());
		
	
	}

}
