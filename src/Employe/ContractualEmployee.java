package Employe;

public class ContractualEmployee extends Employee {

	int hours; // total hours worked
	private int payPerHour;

	ContractualEmployee(String firstN, String secondN, int sin, double wage, int hour, int perHourPay) {
		super(firstN, secondN, sin, wage);
		// TODO Auto-generated constructor stub
		hours = hour;
		payPerHour = perHourPay;
	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;

	}
	@Override

	public double calculatePay() { // biweekly pay
		//
		if (hours > 40) {

			return ((40 * payPerHour) + ((hours - 40) * (payPerHour * 1.5))) * 2;

		} else {

			return (hours * payPerHour) * 2;
		}
	}

}
