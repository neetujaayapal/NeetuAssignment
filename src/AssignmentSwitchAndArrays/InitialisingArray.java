package AssignmentSwitchAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class InitialisingArray {

	public static void main(String[] args) {
		/*There are two ways of initialisation of array
		 * Method 1 
		 * In this method, the exact values inside the array will be provided and can initialize and populate at the same time*/
		 
	String[] colours = {"red","blue","green"};
	System.out.println(Arrays.toString(colours));
	
	/*Method 2
	 * This method only defines the length of the array and the values inside the array gets initialized to default value based
	 * on the datatype .Then the values for each index is provided for population of array.
	 */

	String[] coloursInArray = new String[3];
	coloursInArray[0]="red";
	coloursInArray[1]="blue";
	coloursInArray[2]="green";
	
	System.out.println(Arrays.toString(coloursInArray));
	


	for(int i = 0; i<coloursInArray.length;i++) {
		System.out.println("Enter the colour");
	    Scanner sc = new Scanner(System.in);
	    coloursInArray[i]=sc.next();
	}
	System.out.println(Arrays.toString(coloursInArray));
	}
	

}
