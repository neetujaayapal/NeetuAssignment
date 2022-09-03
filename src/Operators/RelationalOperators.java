package Operators;

public class RelationalOperators {

	// >, <, <=, >=, !=, ==

	public static void main(String[] args) {
		int a = 15;
		int b = 10;

		System.out.println(a < b);

		boolean islessthan = a < b;
		System.out.println(islessthan);

		boolean isGreaterThan = a > b;
		System.out.println(isGreaterThan);

		int d = 50;
		int e = 50;

		boolean isEqualTo = d == e;
		System.out.println(isEqualTo);

		boolean notEqualTo = a != b;
		System.out.println("a not equal to b =" + notEqualTo);

		boolean isNotEqualTo = d != e;
		System.out.println("d is not equal to e =" + isNotEqualTo);

		boolean isGreaterEqualTo = d >= e;
		System.out.println("d is greater than or equal to = " + isGreaterEqualTo);

		boolean isLessThanEqualTo = a <= b;
		System.out.println("a is less than or equal to =" + isLessThanEqualTo);

		int enteredPassword = 9999;
		int exactPassword = 0000;

		boolean isPasswordSame = enteredPassword == exactPassword;
		System.out.println("Is the entered password and exact password same =" + isPasswordSame);

		// eligible to apply for student visa if IELTS >6
		int scored = 7;
		int scoreRequired = 6;

		boolean isEligibleForVisa = scored > scoreRequired;
		System.out.println("Eligible for Study Visa =" + isEligibleForVisa);

		int age = 56;
		int requiredAge = 18;

		boolean isGreaterthan = age > requiredAge;
		System.out.println("Is Eligible to vote =" + isGreaterthan);

		
		boolean isEligibletoVote = false;
		isEligibletoVote = age <= 18;
		System.out.println(isEligibletoVote);

		int ageOfTom = 15;
		int ageOfJack = 20;

		boolean isLesserThan = false;
		isLesserThan = 15 <= 20;
		System.out.println("Tom's age is lesser tha Jack's age =" + isLesserThan);

		boolean isEqual = false;
		isEqual = ageOfTom == ageOfJack;
		System.out.println("Tom's age is equal toJack's age =" + isEqual);

		boolean isGreater = false;
		isGreater = 15 >= 20;
		System.out.println("Tom's age is greater than Jack's age =" + isGreater);

		int password = 0000;
		int enterPassword = 0001;

		boolean isNotEqualToThe = password != enterPassword;
		System.out.println("Both passwords are not equal=" + isNotEqualToThe);

		int speed = 80;
		int speedlimit = 70;

		boolean isSpeedLess = speed <= speedlimit;
		System.out.println("Speed is lesser than limit =" + isSpeedLess);

		int x = 10;
		int y = 9;
		int sum = x + y;
		int mul = x * y;
		boolean isCalculationNotEqual = sum != mul;
		System.out.println("Calculation is not equal =" + isCalculationNotEqual);

		int ageTom = 19;
		int ageRequired = 18;

		boolean g1holder = true;

		boolean isEligibleforg2 = ageTom >= ageRequired && g1holder;
		System.out.println("This person is eligible to take G2=" + isEligibleforg2);

	}

}
