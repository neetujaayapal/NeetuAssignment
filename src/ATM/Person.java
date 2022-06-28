package ATM;

public class Person {

	public String name;
	public long accountNumber;
	double balance;
	public String typeOfAccount;
	int pin = 1234;

	Person(String accHolderName, int number, int bal, String type) {
		name = accHolderName;
		accountNumber = number;
		balance = bal;
		typeOfAccount = type;
	}

}
