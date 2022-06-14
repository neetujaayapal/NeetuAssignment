package Class;

public class Phone {

	 // Attributes of phone
	
	String brand ;
	String name;
	String operatingSystem;
	String colour;
	double screenSize;
	String bodyMaterial ;
	String simSize;
	boolean callAttended;
	
	
	// Methods/functions of phone
	
	boolean callconnect() {
		System.out.println("Calling");

		callAttended = true;
		if (callAttended==true){
			System.out.println("Call connected");
			return true;
		}
	
		
		else  {
			System.out.println("Call not connected");
			return false;
		}

	}
	
	
}
