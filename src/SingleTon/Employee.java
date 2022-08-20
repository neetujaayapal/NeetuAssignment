package SingleTon;

public class Employee {

	String empType1;

	int empId1;

	private Employee() {

		empType1 = "Permananet";
		
		empId1 = 34562;

	}

	private static Employee emp1;

	public static Employee getInstance() {

		if (emp1 == null) {

			emp1 = new Employee();
		}

		return emp1;

	}

}
