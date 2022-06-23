package ClassPrograms;

public class Savings {

	double calculateCompoundInterest(int amount, double rate, int time) {

		double comp = amount * Math.pow(1 + (rate / 12), 12 * 10);
		return comp;
	}

}
