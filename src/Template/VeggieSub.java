package Template;

public class VeggieSub extends Sub {
	
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	
	@Override
	boolean customerWantsMeat() {	
		return false;
	}
	
	@Override
	boolean customerWantsCheese() {	
		return false;
	}
	
	// need to override abstract even if not using
	@Override
	void addMeat() {}

	@Override
	void addCheese() {}

	// methods with implementation
	@Override
	void addVeggies() {
		
		System.out.print("Adding the veggies: ");
		
		String veggies = "";
		for (String veg : veggiesUsed) {
			
			veggies = veggies + veg + ", ";
		}
		veggies = veggies.replaceAll(", $", "");
		
		System.out.print(veggies);
		System.out.println();
	}

	@Override
	void addCondiments() {
		
		System.out.print("Adding the condiments: ");
		
		String condiments = "";
		for (String condiment : condimentsUsed) {
			
			condiments = condiments + condiment + ", ";
		}
		condiments = condiments.replaceAll(", $", "");
		
		System.out.print(condiments);
		System.out.println();

	}

	
}
