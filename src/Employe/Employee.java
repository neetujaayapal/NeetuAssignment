package Employe;

public class Employee {

	String firstName;
	String lastName;
	private int sinnumber;
	protected double salary;

	Employee(String firstN, String secondN, int sin, double wage) {
		super();
		firstName = firstN;
		lastName = secondN;
		sinnumber = sin;
		salary = wage; // monthly salary
	}

	public int getSinnumber() {
		return sinnumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0)
			this.salary = salary;
		else {
			System.out.println("Monthly salary cannot be zero");
		}
	}

	public double calculatePay() { // monthly salary
		return salary;
	}
}
	
