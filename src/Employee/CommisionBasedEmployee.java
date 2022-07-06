package Employee;

public class CommisionBasedEmployee extends Employee {

	int sales;
	double PerCommission;

	CommisionBasedEmployee(String firstN, String secondN, int sin, double wage, int sale, double com) {
		super(firstN, secondN, sin, wage);
		// TODO Auto-generated constructor stub

		sales = sale;
		PerCommission = com;
	}

	@Override
	public double calculatePay() {

		if (sales > 0) {

			return biweeklySalary + (PerCommission * sales);
		} else {
			return biweeklySalary;
		}

	}
}
