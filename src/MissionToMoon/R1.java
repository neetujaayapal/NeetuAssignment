package MissionToMoon;


public class R1 extends Rocket {
	
	//Chance of launch explosion = 5% * (cargo carried / cargo limit)
		//	Chance of landing crash = 1% * (cargo carried / cargo limit)

	
	
	@Override
	public boolean launch() {
		
		return true;
	}
	
	@Override
	
	public boolean land() {
		
		return true;
	
	}
	
	

}
