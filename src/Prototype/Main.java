package Prototype;

public class Main {

	public static void main(String[] args) {
		
		Sheep sheep = new Sheep();
		sheep.setName("Sally");
		System.out.println(sheep); 
		
		Sheep clonedSheep = (Sheep) sheep.makeCopy();
		System.out.println(clonedSheep);
		
	}

}
