package EnumProgram;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Apple product details");

		System.out.println(Phone.APPLE.product);
		System.out.println(Phone.APPLE.price);

		System.out.println("Samsung product details");

		System.out.println(Phone.SAMSUNG.product);
		System.out.println(Phone.SAMSUNG.price);

		System.out.println("Google product details");

		System.out.println(Phone.GOOGLE.product);
		System.out.println(Phone.GOOGLE.price);

		System.out.println("Printing all the phones");

		for (Phone p1 : Phone.values()) {

			System.out.println("Brand details =" + p1);
			System.out.println("Phone name = " + p1.product);
			System.out.println("Phone price =" + p1.price);
		}
		System.out.println("Finding index of all the phones");

		System.out.println("Index of Apple =" + Phone.APPLE.ordinal());
		System.out.println("Index of samsung =" + Phone.SAMSUNG.ordinal());
		System.out.println("Index of Google =" + Phone.GOOGLE.ordinal());

		System.out.println("Printing enum constant of the specified enum type with the specified name");

		System.out.println(Phone.valueOf("APPLE"));
		System.out.println(Phone.valueOf("SAMSUNG"));
		System.out.println(Phone.valueOf("GOOGLE"));

	}

}
