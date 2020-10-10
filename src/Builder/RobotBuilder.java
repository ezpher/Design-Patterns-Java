package Builder;

public interface RobotBuilder {
	
	public RobotBuilder buildRobotHead();
	
	public RobotBuilder buildRobotTorso();
	
	public RobotBuilder buildRobotArms();
	
	public RobotBuilder buildRobotLegs();
	
	public Robot getRobot();
}
