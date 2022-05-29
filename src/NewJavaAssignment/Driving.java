package NewJavaAssignment;

import java.util.Scanner;

public class Driving {

	public static void main(String[] args) {
		int age = 0; 
		System.out.println("Enter the age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		String licenseType = "" ; //licensetype = g1,g2,g
		System.out.println("Enter the license type");
		licenseType = sc.next();
		if (age >= 16) {
			
			if (licenseType.equals("g2")) {
			System.out.println("The person is eligible to take g license");
			}
			else if (licenseType.equals("g1")) {
			System.out.println("The person is eligible to take g2 license");
			}
			else if (licenseType.equals("g")) {
			System.out.println("The person already has valid g license");
			}
			else  {
			System.out.println("The person is eligible to take valid g1 license");
			}
		    }	
				
			else  {
				
				System.out.println("The person is not eligible to take license");	
			}
		    sc.close();
			}

            }
