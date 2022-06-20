package ClassPrograms;

public class Laptop {

	String laptopName;
	int ramSize;
	String processorType;

	void initializeAllVariables() {

		laptopName = "Dell";
		ramSize = 12;
		processorType = "i7";

	}

	Laptop(String name, int size, String type) {
		laptopName = name;
		ramSize = size;
		processorType = type;

	}

	Laptop() {

	}
}
