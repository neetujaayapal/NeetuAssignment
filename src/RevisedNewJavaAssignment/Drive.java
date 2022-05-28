package RevisedNewJavaAssignment;

public class Drive {

	public static void main(String[] args) {
		int age = 15;

		String licenseType = ""; // licensetype = g1,g2,g

		if (age >= 16) {

			if (licenseType.equals("g2")) {
				System.out.println("The person is eligible to take g license");
			} else if (licenseType.equals("g1")) {
				System.out.println("The person is eligible to take g2 license");
			} else if (licenseType.equals("g")) {
				System.out.println("The person already has valid g license");
			} else {
				System.out.println("The person is eligible to take valid g1 license");
			}
		}

		else {

			System.out.println("The person is not eligible to take license");
		}

	}

}
