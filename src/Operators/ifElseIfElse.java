package Operators;

public class ifElseIfElse {

	public static void main(String[] args) {
		// 80-100 = A grade
		// 70-80= B grade
		// 60-70= C grade

		// below 60 = D grade

		int score = 55;

		if (score > 80) {
			System.out.println("Score =A grade");

		} else if (score <= 80 && score >= 70) {
			System.out.println("Score = b grade");

		} else if (score <= 70 && score >= 60) {
			System.out.println("Score = c grade");
		} else {
			System.out.println("Score = D grade");
		}

	}

}
