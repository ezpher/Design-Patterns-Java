package Strategy;

public class Animal {
	
	private String name;
	private String sound;
	private Flys flyingType;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
		
	public String tryFly() {
		if (flyingType.fly() == null) {
			return "No Fly Ability Specified";
		} else {
			return flyingType.fly();	
		}		
	}
	
	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
}
