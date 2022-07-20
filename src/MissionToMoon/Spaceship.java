package MissionToMoon;

public interface Spaceship {
	
	//Item item = new Item();
	
	boolean launch();
	
	
	boolean land();
	
	boolean canCarry(Item item);
	
	int carry(Item item);

}
