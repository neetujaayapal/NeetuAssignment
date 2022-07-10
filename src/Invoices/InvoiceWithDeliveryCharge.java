package Invoices;



public class InvoiceWithDeliveryCharge extends Invoice{
	
	double deliveryCharge;

	public InvoiceWithDeliveryCharge(String product, int qty, double price, double del) {
		super(product, qty, price);
		this.deliveryCharge = del;
	}

	@Override
	public double calculateInvoice() {
		return (qty *price)+deliveryCharge;
	}


}
