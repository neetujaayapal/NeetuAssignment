package EnumProgram;

public class EnumMain {

	public static void main(String[] args) {

		DaysInWeek day1 = DaysInWeek.TUESDAY;

		switch (day1) {
		case MONDAY:
			System.out.println("Weekdays.");
			break;

		case FRIDAY:
			System.out.println("Last day of weekday");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends");
			break;

		default:
			System.out.println("Midweek days");
			break;
		}
		// values() method

		System.out.println("Array of Constants");

		for (DaysInWeek days : DaysInWeek.values()) {

			System.out.println(days);
		}

	}
}
