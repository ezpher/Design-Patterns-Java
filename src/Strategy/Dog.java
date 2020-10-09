package Strategy;

public class Dog extends Animal {
	
	public Dog() {
		
		setSound("Barks");
		
		Flys flyType = new CantFly();
		setFlyingType(flyType);
	}
}
