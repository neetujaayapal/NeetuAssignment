package Inheritance;


public class Account {
	

String name;
	
	String address;
	
	String sinNumber;
	
	String phoneNumber;
	
	double balance; 
	
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
