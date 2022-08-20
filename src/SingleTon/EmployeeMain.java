package SingleTon;

import java.io.Console;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = Employee.getInstance();

		System.out.println(e.empType1);
		
		System.out.println(e.empId1);

		Employee b = Employee.getInstance();

		System.out.println(b.empType1);
		
		System.out.println(b.empId1);

		Employee c = Employee.getInstance();

		System.out.println(c.empType1);
		
		System.out.println(c.empId1);

	}

}
