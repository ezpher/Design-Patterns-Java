package Factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an enemy ship type i.e. 'U' or 'R': ");
		
		while (scanner.hasNextLine()) {
			String shipType = scanner.nextLine();
			
			EnemyShip enemyShip = enemyShipFactory.makeEnemyShip(shipType);
			
			if (enemyShip != null) {
				doEnemyStuff(enemyShip);
			} else {
				System.out.println("Enter 'U' or 'R' next time");
			}
		}
	}
	
	public static void doEnemyStuff(EnemyShip ship) {
		ship.displayEnemyShip();
		ship.followHeroShip();
		ship.enemyShipShoots();
	}

}
