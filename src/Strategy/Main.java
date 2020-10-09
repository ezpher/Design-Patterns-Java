package Strategy;

public class Main {

	public static void main(String[] args) {
		Animal Sparky = new Dog();
		Animal Tweety = new Bird();
		
		System.out.println(Sparky.tryFly()); 
		System.out.println(Tweety.tryFly()); 

	}

}
