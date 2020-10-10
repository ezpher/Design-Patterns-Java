package Factory;

public abstract class EnemyShip {
	private String name;
	private double damage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is displayed on screen");
		
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + "attacks and does " +  getDamage() + " damage to hero");
	}
}
