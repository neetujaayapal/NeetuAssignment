package Enum;

public class EnumTest {
	
    DaysInWeek day;
    
    public EnumTest(DaysInWeek day) {
        this.day = day;
    }
    
    public void daysDescription() {
        switch (day) {
            case MONDAY:
                System.out.println("Weekdays.");
                break;
                    
            case FRIDAY:
                System.out.println("Last day of weekday");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends");
                break;
                        
            default:
                System.out.println("Midweek days");
                break;
        }

}
}