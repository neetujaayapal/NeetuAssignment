package MissionToMoon;


public class R2 extends Rocket{
	
	//Chance of launch explosion = 4% * (cargo carried / cargo limit)
			//Chance of landing crash = 8% * (cargo carried / cargo limit)

	
	
	@Override
	public boolean launch() {
		
		return true;
		
	}
	
	@Override
	
	public boolean land() {
		
		return true;
	}

}
