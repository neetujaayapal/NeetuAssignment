package AssignmentLoopsAndScanners;

import java.util.Scanner;

public class TemperatureTable {

	public static void main(String[] args) {
		/* When the user enter 0 temperature, the below table should be dispalyed
		 * -20.00        -4.00
		 * -15.00         5.00
		 * -10.00        14.00
		 * 
		 * -5.00        23.00
		 * 0.00        32.00
		 * 5.00        41.00
		 * 
		 * 10.00        50.00
		 * 15.00        59.00
		 * 20.00        68.00
		 *25.00        77.00
		 */
		
		double currentTemperature = 0;
		System.out.println("Enter the temperature");
		Scanner sc = new Scanner (System.in);
		currentTemperature = sc.nextDouble();
		
		System.out.println("Celsius");
	    
	    for (int temp =-20; temp<=25;temp+=5) {
	  
	    System.out.println(+temp);
	    }
	    
	    System.out.println("Fahren Heat");
	     for (int temperature = -4 ; temperature<=77 ;temperature+=9) {
	    	 System.out.println(+temperature);
	     }
	    
	     sc.close();
	
	
	

	}

}
