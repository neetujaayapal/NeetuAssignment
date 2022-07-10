package Invoices;

public class PickUpInvoice extends Invoice {

	public PickUpInvoice(String pro, int qua, double pri) {
		super(pro,qua,pri);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateInvoice() {
		return qty *price;
	}
	

}
