package EnumProgram;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorEnum c1 = CalculatorEnum.addition;

		int constant1 = 9;
		double constant2 = 5.5;

		switch (c1) {
		case addition:

			System.out.println(constant1 + CalculatorEnum.addition.symbol + constant2 + "=" + (constant1 + constant2));

			break;

		case substraction:

			System.out.println(
					constant1 + CalculatorEnum.substraction.symbol + constant2 + "=" + (constant1 + constant2));

			break;

		case multiplication:

			System.out.println(
					constant1 + CalculatorEnum.multiplication.symbol + constant2 + "=" + (constant1 + constant2));

			break;

		case division:

			System.out.println(constant1 + CalculatorEnum.division.symbol + constant2 + "=" + (constant1 + constant2));

			break;

		}

		// Printing all operations using values() method

		System.out.println("Printing operations and symbols");

		for (CalculatorEnum operations : CalculatorEnum.values()) {

			System.out.println("Operations =" + operations);
			System.out.println("Symbols = " + operations.symbol);
		}

	}

}
