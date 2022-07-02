package ATM;

public class Person {

	public String name;
	public long accountNumber;
	double balance;
	public String typeOfAccount;
	private int pin ;

	Person(String accHolderName, int number, int bal, String type, int bankpin) {
		name = accHolderName;
		accountNumber = number;
		balance = bal;
		typeOfAccount = type;
		pin = bankpin;
	}
	

	int usePin() {
		
		return pin;
	}
}
