package PaymentInACompany;

public class LocalPurchasePayment extends Payment {

    //double localTax;
	public LocalPurchasePayment(String productName, String productCategory, int qt,int pric, double tax) {
		super(productName, productCategory,qt, pric,tax);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public double calculatePayment() {
        //double total = qty*price;
        //double amountOfTax = total*tax;

		return (qty*price)-((qty*price)*tax);
		
	}

}
