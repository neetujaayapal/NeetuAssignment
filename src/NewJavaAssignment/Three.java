package NewJavaAssignment;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int productPrice = 0;
		System.out.println("Enter the price");
        Scanner sc = new Scanner (System.in);
         productPrice = sc.nextInt();
		double defaultDiscount = 0.50;
	
		double discountprice = productPrice * defaultDiscount;
		double priceAfterDefaultDiscount = productPrice - discountprice;
		System.out.println("Price after default discount ="+priceAfterDefaultDiscount);
		
		//promo5 ,promo10, promo20 = promocodes
		
		String promoCode = ""; 
		
		System.out.println("Enter the promocode =");
	

		promoCode = sc.next();
		
		double promo5Discount = 0.05;
		double promo5DiscountPrice = priceAfterDefaultDiscount * promo5Discount;
		double priceAfterPromo5Discount = priceAfterDefaultDiscount - promo5DiscountPrice;
		
		
		double promo10Discount = 0.10;
		double promo10DiscountPrice = priceAfterDefaultDiscount * promo10Discount;
		double priceAfterPromo10Discount = priceAfterDefaultDiscount - promo10DiscountPrice;
		
		
		double promo20Discount = 0.20;
		double promo20DiscountPrice = priceAfterDefaultDiscount * promo20Discount;
		double priceAfterPromo20Discount = priceAfterDefaultDiscount - promo20DiscountPrice;
		
				
		if (promoCode.equals("promo5")) {
		
		System.out.println("Additional discount after applying PROMO 5 ="+promo5DiscountPrice);
		System.out.println("The final price after applying PROMO5 ="+priceAfterPromo5Discount);
				
		}else if (promoCode.equals("promo10")) {
		
		System.out.println("Additional discount after applying PROMO 10 ="+promo10DiscountPrice);
		System.out.println("The final price after applying PROMO10 ="+priceAfterPromo10Discount);
		
		}else  {
		
		System.out.println("Additional discount after applying PROMO 20 ="+promo20DiscountPrice);
		System.out.println("The final price after applying PROMO20 ="+priceAfterPromo20Discount);

		}

		 sc.close();
	}
	
       
}
