package Builder;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		
		this.robot = new Robot();
		
	}
	
	public RobotBuilder buildRobotHead() {
		
		robot.setRobotHead("Tin Head");
		return this;
	}

	public RobotBuilder buildRobotTorso() {
		
		robot.setRobotTorso("Tin Torso");
		return this;

	}

	public RobotBuilder buildRobotArms() {
		
		robot.setRobotArms("Blowtorch Arms");
		return this;

	}

	public RobotBuilder buildRobotLegs() {
		
		robot.setRobotLegs("Rollar Skates");
		return this;

	}

	public Robot getRobot() {
		
		return this.robot;
	}
	
	
}
