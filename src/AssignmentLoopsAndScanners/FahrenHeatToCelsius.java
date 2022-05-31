package AssignmentLoopsAndScanners;

import java.util.Scanner;

public class FahrenHeatToCelsius {

	public static void main(String[] args) {
		// Convert the temp from Celsius to Fahrenheat
		//Celsius to Fahrenheat:  (0°C × 9/5) + 32 = 32°F
		
		double temperature = 0;
		System.out.println("Enter the temperature in Celsius");
		Scanner sc = new Scanner (System.in);
		temperature = sc.nextDouble();
		
	    double tempInFahren = (temperature*9/5)+32;
	    System.out.println("Temperature in Fahren Heat = ("+temperature+ "°C x 9/5) + 32 ="+tempInFahren+ "°F" );
	    sc.close();
	
	
	
	
	}

}
