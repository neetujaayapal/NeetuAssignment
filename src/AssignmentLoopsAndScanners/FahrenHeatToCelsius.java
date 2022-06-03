package AssignmentLoopsAndScanners;

import java.util.Scanner;

public class FahrenHeatToCelsius {

	public static void main(String[] args) {
	//  program that can convert degrees Fahrenheit to degrees Celsius, or vice versa
		
		Scanner sc = new Scanner (System.in);
		
		String unit = ""; //C ,F
		System.out.println("Enter the unit");
		unit = sc.next();
		
		double temperature = 0;
		System.out.println("Enter the temperature");
		temperature = sc.nextDouble();
		if (unit.equals("C")) {
		double tempInFahrenHeat = (temperature*9/5)+32;
		System.out.println("Temperature in fahren heat =("+temperature+ "X  9/5)  + 32  =" +tempInFahrenHeat+ "°F" );
		System.out.println("Temperature in fahren heat = "+Math.round(tempInFahrenHeat)+ "°F");
		}
		else if (unit.equals("F")) {
			double tempInCelsius = (temperature-32)*5/9;
			System.out.println("Temperature in Celsius =("+temperature+ " - 32)  x 5/9  =" +tempInCelsius+ "°C");
			System.out.println("Temperature in Celsius = "+Math.round(tempInCelsius)+ "°C");
		}
	    sc.close();
		
	
	
	
	}

}
