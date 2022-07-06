package Employee;

public class ContractualEmployee extends Employee {

	int extraHours;
	private int payPerHour;

	ContractualEmployee(String firstN, String secondN, int sin, double wage, int hours, int perHourPay) {
		super(firstN, secondN, sin, wage);
		// TODO Auto-generated constructor stub

		extraHours = hours;
		payPerHour = perHourPay;

	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	@Override

	public double calculatePay() {

		if (extraHours > 0) {

			return biweeklySalary + (extraHours * (payPerHour * 1.5));

		} else {

			return biweeklySalary;

		}

	}

}
