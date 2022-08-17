package Enum;



public class EnumMain {

	public static void main(String[] args) {
		
		EnumTest day1 = new EnumTest(DaysInWeek.MONDAY);
		day1.daysDescription();
		EnumTest day2 = new EnumTest(DaysInWeek.TUESDAY);
		day2.daysDescription();
		EnumTest day3 = new EnumTest(DaysInWeek.SATURDAY);
		day3.daysDescription();
		EnumTest day4 = new EnumTest(DaysInWeek.FRIDAY);
		day4.daysDescription();
		
		
		for(DaysInWeek days :DaysInWeek.values() ){
			
			System.out.println(days);
		}
}
}
