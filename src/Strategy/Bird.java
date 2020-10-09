package Strategy;

public class Bird extends Animal {
	
	public Bird() {
		
		setSound("Tweets");
		
		Flys flyType = new ItFlys();
		setFlyingType(flyType);
	}
}
