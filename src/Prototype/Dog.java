package Prototype;

public class Dog implements Animal {
	
	private String name;
	
	public Dog() {

		System.out.println("Dog is being made");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	@Override
	public Animal makeCopy() {
		
		System.out.println("Copy of Dog is being made");
		
		Dog dog = null;
		
		try {
			dog = (Dog) super.clone();
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return dog;
	}
	
	@Override
	public String toString() {
		return name; 
	}

}
