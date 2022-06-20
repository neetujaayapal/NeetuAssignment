package ClassPrograms;

public class LaptopMain {

	public static void main(String[] args) {
	

		// Initialized the variables using object
		Laptop hp = new Laptop();
		hp.laptopName = "HP";
		hp.ramSize = 8;
		hp.processorType = "i5";

		// Initialized the variables using method
		Laptop dell = new Laptop();
		dell.initializeAllVariables();

		// Initialized the variables using parameterized constructor
		Laptop samsung = new Laptop("Samsung", 4, "i3");
		samsung.initializeAllVariables();

	}

}
