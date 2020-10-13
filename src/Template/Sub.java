package Template;

//A Template Method Pattern contains a method that provides
//the steps of the algorithm. It allows subclasses to override 
//some of the methods
public abstract class Sub {
	
	boolean afterFirstItem;
	
	final void makeSandwich() {
		
		cutBun();
		
		if (customerWantsVeggies()) {
			
			addVeggies();
			
			afterFirstItem = true;
		}
		
		if (customerWantsMeat()) {
			
			addMeat();
			
			afterFirstItem = true;
		}
		
		if (customerWantsCheese()) {
			
			addCheese();
			
			afterFirstItem = true;
		}
		
		if (customerWantsCondiments()) {
			
			addCondiments();
			
			afterFirstItem = true;
		}
		
		wrapTheSub();
	}
	
	// These methods must be overridden by the extending subclasses
	
		abstract void addMeat();
		abstract void addCheese();
		abstract void addVeggies();
		abstract void addCondiments();
		
		public void cutBun(){
			
			System.out.println("The Hoagie is Cut");
			
		}
		
		// These are called hooks
		// If the user wants to override these they can
		
		// Use abstract methods when you want to force the user
		// to override and use a hook when you want it to be optional
		
		boolean customerWantsMeat() { return true; }
		boolean customerWantsCheese() { return true; }
		boolean customerWantsVeggies() { return true; }
		boolean customerWantsCondiments() { return true; }
		
		public void wrapTheSub(){
			
			System.out.println();
			System.out.println("Wrap the Sub");
			
		}
		
		public void afterFirstItem(){
			
			System.out.println();
			System.out.println();
			
		}
}
