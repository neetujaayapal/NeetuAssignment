package AssignmentSwitchAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {

		String brandNameOfPhone = "";// samsung,google,apple
		System.out.println("Enter the brand name");
		Scanner sc = new Scanner(System.in);
		brandNameOfPhone = sc.next();

		switch (brandNameOfPhone) {
		case "samsung":

			String[] samsungPhones = {"S20","S21","Flip3","Fold3"};
			
			System.out.println(Arrays.toString(samsungPhones));
			System.out.println("Enter one product of samsung");
			String enterOneProduct = "";
			enterOneProduct = sc.next();

			boolean isProductInList = false;
			System.out.println("Is the product in list");
			isProductInList = sc.nextBoolean();
			for (int index = 0; index < samsungPhones.length; index++) {

				if (isProductInList == true) {
					if (samsungPhones[index].equals(enterOneProduct)) {
						System.out.println("Product selected is " + enterOneProduct);
						break;
					}
				}
			}
			if (isProductInList == false) {
				System.out.println("Please select a product from the list");

			}

			break;
		case "google":
			
			String[] googlePhones = {"GooglePixel6","GooglePixel6Pro","GooglePixelPro","GooglePixel5"};
			
			System.out.println(Arrays.toString(googlePhones));
			
			String enterProduct = "";
			System.out.println("Enter one product of google");
			
			enterProduct = sc.next();
			boolean isProductInGoogleList = false;
			System.out.println("Is the product in list");
			isProductInGoogleList = sc.nextBoolean();

			for (int index = 0; index < googlePhones.length; index++) {
				if (isProductInGoogleList == true) {
					if (googlePhones[index].equals(enterProduct)) {
						System.out.println("Product selected is " + enterProduct);
						break;
			
					
					}
				}
			}
			if (isProductInGoogleList == false) {
				System.out.println("Please select a product from the list");
			}
			break;

		case "apple":

			String[] applePhones = {"Iphone12","Iphone12mini","Iphone11","Iphone11"};
			
			System.out.println(Arrays.toString(applePhones));

			System.out.println("Enter one product name");
			String enterAppleProduct = "";
			enterAppleProduct = sc.next();
			boolean isProductInAppleList = false;
			System.out.println("Is the product in list");
			isProductInAppleList = sc.nextBoolean();

			for (int index = 0; index < applePhones.length; index++) {
				if (isProductInAppleList == true) {
					if (enterAppleProduct.equals(applePhones[index])) {
						System.out.println("Product selected is " + enterAppleProduct);
					break;
					}
				}
			}
			if (isProductInAppleList == false) {
				System.out.println("Please select a product from the list");
			}
			break;
		default:
			System.out.println("Enter the brand name in the list");
		}
		sc.close();
	}

}
