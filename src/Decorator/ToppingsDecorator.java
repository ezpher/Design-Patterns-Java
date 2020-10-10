package Decorator;

// Purpose of this class is to allow toppings 
// to override pizza when ever there are changes e.g. add toppings cost to pizza
// without needing to make changes to the pizza class directly
public abstract class ToppingsDecorator implements Pizza {
	
	protected Pizza tempPizza;
	
	public ToppingsDecorator(Pizza pizza) {
		tempPizza = pizza;
	}
	
	@Override
	public String getDescription() {
		
		return tempPizza.getDescription();
	
	}
	
	@Override
	public double getCost() {
		
		return tempPizza.getCost();	
	}
}
