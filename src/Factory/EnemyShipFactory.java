package Factory;

public class EnemyShipFactory {
	
	EnemyShip makeEnemyShip(String shipType) {			
		
		if (shipType.equals("U")) {
			
			return new UFOEnemyShip();
			
		} else if (shipType.equals("R")) {
			
			return new RocketEnemyShip();
			
		} else {
			return null;
		}
	}
}
