package PaymentInACompany;

public class Payment {
	
	String productName ;
	String productCategory;
	int qty;
	double tax;
	protected int price;
	
	public Payment(String name, String cat, int qt, int pric,double tx) {
		
		productName = name;
		productCategory = cat;
		qty = qt;
		price = pric;
		tax = tx;
		
		// TODO Auto-generated constructor stub
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public double calculatePayment () {
		
		return price;
	}
	
	
	

}
