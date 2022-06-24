package AssignmentClassPrograms;

public class Invoicemain {

	public static void main(String[] args) {

		Invoice no1 = new Invoice();

		Products[] selectedProduct = new Products[4];

		selectedProduct[0] = new Products("Milk", 10, "puremilk", 6);

		selectedProduct[1] = new Products("Yogurt", 3, "pure", 4);

		selectedProduct[2] = new Products("chicken", 10, "frozenchicken", 2);

		selectedProduct[3] = new Products("grapes", 5, "organic", 1);

		double total = no1.generateInvoice(selectedProduct);

		double amountOfTax = no1.taxamount(total, 0.13);

		double amountAfterTax = no1.amountwithTax(total, amountOfTax);

		System.out.println("Total amount =" + total);
		System.out.println("Tax = " + amountOfTax);

		System.out.println("Amount with tax = " + amountAfterTax);

	}

}
