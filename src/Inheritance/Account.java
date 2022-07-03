package Inheritance;


public class Account {
	

String name;
	
	String address;
	
	String sinNumber;
	
	String phoneNumber;
	
	double balance; 
	
	int pin;
	
	String typeOfAccount;
	
	Account(int pin){
	pin = pin;
		
	}
	
	
	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	
	
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double  depositMoney(double amount) {
		
		balance = balance +amount;
		return balance;
	}
	
	public boolean authorization(int pin, String account) {
		
		switch(account){
		
		case  "Chequing": 
			if(pin ==1234) {
				return true;
			}
			break;
			
		case "Saving" : 
			if(pin ==3456) {
				return true;
			}
			break;
			
		case "TFSA":
			if(pin ==6666) {
				return true;
			}
			break;
			
			
		}
		
		return false;
		
	}
	
	double withdraw (double amount) {
		
		
		balance = balance - amount;
		System.out.println("Balance ="+balance);
		return balance;
	}
	

}
