package Employe;

public class CommisionBasedEmployee extends Employee {

	
	int salesBiweekly;
	double percentageCommission;

	CommisionBasedEmployee(String firstN, String secondN, int sin, double wage, int sale, double com) {
		super(firstN, secondN, sin, wage);
		// TODO Auto-generated constructor stub

		
		salesBiweekly = sale;
		percentageCommission = com;
	}

	@Override
	public double calculatePay() {// pay per month

		if (salesBiweekly > 0) { 

			return salary/2+ (percentageCommission * salesBiweekly);
		} else {
			return salary/2;
		}

	}
}
