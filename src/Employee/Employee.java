package Employee;

public class Employee {

	String firstName;
	String lastName;
	private int sinnumber;
	protected double biweeklySalary;

	Employee(String firstN, String secondN, int sin, double wage) {
		super();
		firstName = firstN;
		lastName = secondN;
		sinnumber = sin;
		biweeklySalary = wage;

	}

	public int getSinnumber() {

		return sinnumber;
	}

	public double getBiweeklySalary() {
		return biweeklySalary;
	}

	public void setBiweeklySalary(double biweeklySalary,boolean isHrAllowed) {

		if (isHrAllowed && biweeklySalary >= 0)
			this.biweeklySalary = biweeklySalary;
		else {
			System.out.println("Salary cannot be changed");
		}
	}

	public double calculatePay() {

		return biweeklySalary;
	}

}
