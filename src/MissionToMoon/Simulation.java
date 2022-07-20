package MissionToMoon;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Simulation {

	// this method loads all items from a text file and returns an ArrayList of
	// Items.

	public ArrayList<Item> loadItems() throws Exception {

		// should read the text file line by line and
		// create an Item object
		// then add it to an ArrayList of Items.
		// The method should then return that ArrayList.
		ArrayList<Item> items = new ArrayList<Item>();
		File file = new File("C:\\Users\\neetu\\Desktop\\phase-1.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] itemOne = line.split("=");
			//System.out.println(Arrays.toString(itemOne));

			Item item = new Item();

			item.name = itemOne[0];

			item.weight = Integer.valueOf(itemOne[1]);

			items.add(item);
		}

		return items;

	}

	// this method takes the ArrayList of Items returned from loadItems and starts
	// creating R1 rockets.
	// It first tries to fill up 1 rocket with as many items as possible before
	// creating a new rocket object
	// and filling that one until all items are loaded. The method then returns the
	// ArrayList of those R1
	// rockets that are fully loaded.

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

		ArrayList<Rocket> rocket1 = new ArrayList<Rocket>();

		R1 r1 = new R1();
		
		
		
		
		
		
		

		return rocket1;

	}
	
	/*this method also takes the ArrayList of Items and starts 
	 * creating R2 rockets and filling them with those items the 
	 * same way as with R1 until all items are loaded. The method 
	 * then returns the ArrayList of those R2 rockets that are fully 
	 * loaded.
	 */

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

		ArrayList<Rocket> rocket1 = new ArrayList<Rocket>();

		R2 r1 = new R2();
		
		
		
		
		

		return rocket1;

	}
	
	/*this method takes an ArrayList of Rockets and calls launch and 
	 * land methods for each of the rockets in the ArrayList. Every 
	 * time a rocket explodes or crashes (i.e if launch or land return 
	 * false) it will have to send that rocket again. All while keeping 
	 * track of the total budget required to send each rocket safely to 
	 * Mars. runSimulation then returns the total budget required to 
	 * send all rockets (including the crashed ones).
	 */

	public double runSimulation(ArrayList<Rocket> rockets) {
	      
     return 10;
}
}
