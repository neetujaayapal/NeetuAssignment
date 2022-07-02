package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee(89795);
		
		CRA cra = new CRA ();
	//	boolean isCRA = true;
		
		System.out.println(" First Sin num :"+employee.getSinNumber());
		
		employee.setSinNumber(23456,cra,1234);

		System.out.println("Second Sin num :"+employee.getSinNumber());
		
		employee.setSinNumber(342432,cra,1234);
		
		System.out.println("Third Sin num :"+employee.getSinNumber());
		
		//only CRA can change the SIN Number
		
		employee.setSinNumber(23456, cra,1234);

		System.out.println("Fourth Sin num :"+employee.getSinNumber());
		

	}

}
