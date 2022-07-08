package PaymentInACompany;

public class InternationalPurchasePayment extends Payment {
	
	double shippingCost;
	

	public InternationalPurchasePayment(String productName, String productCategory, int qty,int price,double ship,double tx) {
		super(productName, productCategory,qty, price,tx);
		// TODO Auto-generated constructor stub
		shippingCost = ship;
	}
	
	
	
	@Override
	
	public double calculatePayment() {

		return ((qty*price)-((qty*price)*tax))+shippingCost;
	}


}
