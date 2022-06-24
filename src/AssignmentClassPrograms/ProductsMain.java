package AssignmentClassPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ProductsMain {

	public static void main(String[] args) {

		Products product1 = new Products("Dairy milk",5,"cadbury",5);

		Products product2 = new Products("Kinderjoy",8,"candy",5);
	
		Products product3 = new Products("Yogurt",3,"pure",4);
		
		Products product4 = new Products("Milk",10,"puremilk",6);
	
		Products product5 = new Products("Pepsi",2,"cooldrink",3);
		
		Products product6 = new Products("Cococola",2,"cooldrink",2);
		
		Products product7 = new Products("Chicken",10,"frozenchicken",1);

		Products product8 = new Products("Timbits",5,"sweet",7);
	
		Products product9 = new Products("Apple",10,"organic",4);

		Products product10 = new Products("Grapes",5,"organic",3);

		
		String[] productArray = {"product1","product2","product3","product4","product5","product6","product7","product8","product9","product10"};
		
		System.out.println(Arrays.toString(productArray));
		
		
		//String[] productArray = new String[10];
		
		//for(int i = 0; i<productArray.length;i++) {
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Enter the product");
			//productArray[i] = sc.next();
			
		//}
		
		//System.out.println(Arrays.toString(productArray));
		
	
	}
}
