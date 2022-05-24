package NewJavaAssignment;

public class One {

	public static void main(String[] args) {
		// Person's age is 25 and he has valid g1 license.Then he is eligible to take
		// g2.
		int age = 25;
		int requiredAge = 18;

		boolean isAgeMet = age >= requiredAge;
		System.out.println("Age criteria is met =" + isAgeMet);

		boolean g1Holder = true;
		boolean g2Holder = false;

		if (isAgeMet) {
			if (g2Holder) {
				System.out.println("The person is eligible to take g license");
			} else if (g1Holder) {
				System.out.println("The person is eligible to take g2 license");
			} else {
				System.out.println("The person is eligible to take g1 license");
			}

		} else {

			System.out.println("The person is not eligible to take license");

		}

	}

}
