package Class;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {

     Phone iphone = new Phone();
  
     iphone.brand = "Iphone";
     iphone.name = "Iphone 13";
     iphone.bodyMaterial = "Aluminium";
     iphone.operatingSystem = "iOS";
     iphone.colour = "black";
     iphone.screenSize = 6.1;
     iphone.simSize = "nano";

     
     System.out.println("Brand = " +iphone.brand);
     System.out.println("Name = " +iphone.name);
     System.out.println("Body Material = " +iphone.bodyMaterial);
     System.out.println("Operating System = " +iphone.operatingSystem);
     System.out.println("Colour = " +iphone.colour);
     System.out.println("Screen size = " +iphone.screenSize+ "inches");
     System.out.println("Sim size = " +iphone.simSize);
     
    
     boolean hasCallConnected =iphone.callconnect();
     System.out.println("Call connected ="+hasCallConnected);
    
	}

}
