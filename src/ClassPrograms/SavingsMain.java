package ClassPrograms;

public class SavingsMain {

	public static void main(String[] args) {

		Savings neetu = new Savings();

		neetu.calculateCompoundInterest(5000, 0.05, 10);
		System.out.println("Investment after 10 years = " + Math.round(neetu.calculateCompoundInterest(5000, 0.05, 10)));

	}

}
