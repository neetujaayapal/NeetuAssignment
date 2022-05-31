package AssignmentLoopsAndScanners;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		
		/* Assume 2 variables.One for height in feet and the other for the height in inches
		 * Convert the height given in feet and inches to cm.
		 */
		
		int partOfHeightInFeet = 0;
		System.out.println("Enter the height in feet =");
		Scanner sc = new Scanner(System.in);
		partOfHeightInFeet = sc.nextInt();
		
		int partOfHeightInInch = 0;
		System.out.println("Enter the height in inch =");
		partOfHeightInInch = sc.nextInt();
		
	
		double cmValueForFeet = 30.48;
		double cmValueForInch = 2.54;
		double feetHeightInCm = partOfHeightInFeet*cmValueForFeet;
		double InchHeightInCm = partOfHeightInInch*cmValueForInch;
		double totalHeight = feetHeightInCm+InchHeightInCm;
		
		System.out.println("Height in cm =" +cmValueForFeet+  " * "+partOfHeightInFeet+ " + " +cmValueForInch+ " * "+partOfHeightInInch+ " centimeters");
        System.out.println("Total Height in cm ="+totalHeight+ " cm");
		sc.close();
	}

}
