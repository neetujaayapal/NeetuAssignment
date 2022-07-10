package Invoices;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PickUpInvoice inv1 = new PickUpInvoice("Blanket", 2,30);
		
		System.out.println("Invoice amount ="+inv1.calculateInvoice());
		
		InvoiceWithDeliveryCharge inv2 = new InvoiceWithDeliveryCharge("DinnerSet",1,50,10);
		
		System.out.println("Invoice amount with delivery charge ="+inv2.calculateInvoice());
		
		InvoiceWithInstallationCharge inv3 = new InvoiceWithInstallationCharge("Recliner",1,400,75);

		System.out.println("Invoice amount with installation charge ="+inv3.calculateInvoice());
	}

}
