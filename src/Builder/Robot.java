package Builder;

// represents the robot attributes, 
// robot builder will use this to set values for attributes, and
// robot engineer i.e. the director in the builder pattern, will be the one that utilizes the robot builder to build the specific robot 
public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	public void setRobotHead(String head) {
		
		robotHead = head;
		
	}
	
	public String getRobotHead(){ return robotHead; }

	
	public void setRobotTorso(String torso) {
		
		robotTorso = torso;
		
	}
	
	public String getRobotTorso(){ return robotTorso; }

	
	public void setRobotArms(String arms) {
		
		robotArms = arms;
		
	}
	
	public String getRobotArms(){ return robotArms; }

	
	public void setRobotLegs(String legs) {
		
		robotLegs = legs;
		
	}
	
	public String getRobotLegs(){ return robotLegs; }
	
	
}
