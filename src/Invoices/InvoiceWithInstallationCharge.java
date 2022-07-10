package Invoices;

public class InvoiceWithInstallationCharge extends Invoice {
	
	double installationCharge;

	public InvoiceWithInstallationCharge(String productName, int qty, double price, double installationCharge) {
		super(productName, qty, price);
		this.installationCharge = installationCharge;
	}

	@Override
	public double calculateInvoice() {
		return (qty *price)+installationCharge;
	}

}
