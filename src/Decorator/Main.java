package Decorator;

public class Main {

	public static void main(String[] args) {

		// The PlainPizza object is sent to the Mozzarella constructor
		// and then to the TomatoSauce constructor
		
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		// getters use recursion to get the cummulative description and cost of the pizza and toppings  
		System.out.println("Ingredients: " + basicPizza.getDescription());
		
		System.out.println("Price: " + basicPizza.getCost());
	}

}
