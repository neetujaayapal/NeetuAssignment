package MissionToMoon;

public class Rocket implements Spaceship {

	
	int cost;
	int Weight;
	int maxWeight;

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {

		return true;
	}
	@Override
	public boolean canCarry(Item item) {

		return true;

		}
		
	
	@Override
	public int carry(Item item) {

		
	return 10;
	}
}
