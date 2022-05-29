package practiseProblems;

public class problemOne {

	public static void main(String[] args) {

		// print a number and find whether it is positive or negative
		int number = 15;

		if (number > 0) {
			System.out.println("Positive number");

		} else

			System.out.println("Negative number");

		// take 3 number and print the greatest number

		int number1 = 560;
		int number2 = 73;
		int number3 = 34;

		if (number1 > number2 && number1 > number3) {
			System.out.println("Greatest number =" + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("Greatest number =" + number2);

		} else {
			System.out.println("Greatest number =" + number3);

		}

		// check whether the no. of passengers is greater than the capacity of bus

		int busCapacity = 100;
		int passengers = 80;

		if (passengers > busCapacity) {
			System.out.println("Bus overloaded");

		} else {
			System.out.println("Can accomodate more");

		}
		
		//calculation of wages 
		
		int wageForOneHour = 25;
		double wageForMoreThanfourtyHr = wageForOneHour * 1.5;
		double totalWagesfor40Hour = wageForOneHour*40;
		double totalWagesforExtra6Hour = wageForMoreThanfourtyHr*6;
		double totalWages = totalWagesfor40Hour+totalWagesforExtra6Hour;
		
		
		System.out.println("Total wage ="+totalWages);
		
		//player wins if she is able to guess the number	

	}

}
