package PaymentInACompany;

public class CashPurchasePayment extends Payment {

	

	public CashPurchasePayment(String name, String cat, int qt, int pric,double tx) {
		super(name, cat,qt, pric,tx);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculatePayment() {

		return qty * price;
	}

}
