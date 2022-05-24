package assignmentTwo;

public class QuestionTwo {

	public static void main(String[] args) {

		int presentCount = 50;
		int startCount = 0;

		while (startCount <= 49) {

		startCount++;
		System.out.println(startCount);

		if (presentCount == startCount) {
				break;
		}
		}
		if (presentCount >= 50) {
			System.out.println("Maximum Capacity Reached");
		}
	}
}
