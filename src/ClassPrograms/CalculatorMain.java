package ClassPrograms;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calc1 = new Calculator();

		System.out.println("Addition = " + calc1.addition(20, 10));

		System.out.println("Substraction =" + calc1.substraction(60, 20));

		System.out.println("Multiplication =" + calc1.multiplication(40, 20));

		System.out.println("Division = " + calc1.division(70, 10));
		
		
	}

}
