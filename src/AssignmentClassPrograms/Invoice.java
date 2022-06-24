package AssignmentClassPrograms;

public class Invoice {

	double generateInvoice(Products[] pro) {

		double overAllPrice = 0;

		for (int i = 0; i < pro.length; i++) {

			double total = pro[i].price * pro[i].qty;

			overAllPrice = overAllPrice + total;

		}
		return overAllPrice;
	}

	double taxamount(double totalamount, double percOftax) {

		return totalamount * percOftax;

	}

	double amountwithTax(double total, double tax) {

		return total + tax;
	}

}
