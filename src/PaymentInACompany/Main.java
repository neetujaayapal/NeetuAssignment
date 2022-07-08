package PaymentInACompany;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashPurchasePayment pay1 = new CashPurchasePayment("Pen", "Stationary",100 ,20,0);
		System.out.println(pay1.calculatePayment());
		
		LocalPurchasePayment pay2 = new LocalPurchasePayment("Basmati","Rice",50, 10,0.13);
		System.out.println(pay2.calculatePayment());
		
		InternationalPurchasePayment pay3 = new InternationalPurchasePayment("Spray","cosmetics",40,15,1000,0.15);
		System.out.println(pay3.calculatePayment());
	}

}
