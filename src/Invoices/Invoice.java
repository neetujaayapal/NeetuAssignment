package Invoices;

public class Invoice {
	
	String productName ;
	int qty;
    protected double price;
	public Invoice(String productName, int qty, double price) {
		super();
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateInvoice() {
		return price;
	}
	
	

}
