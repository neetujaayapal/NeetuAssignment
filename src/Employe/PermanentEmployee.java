package Employe;

public class PermanentEmployee extends Employee {

	PermanentEmployee(String firstN, String secondN, int sin, double wage) {

		super(firstN, secondN, sin, wage);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	
	public double calculatePay() { // biweekly pay

		return salary / 2; //
	}



}
