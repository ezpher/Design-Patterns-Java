package Prototype;

public class Sheep implements Animal {
	
	private String name;
	
	public Sheep() {

		System.out.println("Sheep is being made");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	@Override
	public Animal makeCopy() {
		
		System.out.println("Copy of Sheep is being made");
		
		Sheep sheep = null;
		
		try {
			sheep = (Sheep) super.clone();
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return sheep;
	}
	
	@Override
	public String toString() {
		return name; 
	}
}
