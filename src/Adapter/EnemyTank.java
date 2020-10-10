package Adapter;

import java.util.Random;

//EnemyTank implements EnemyVehicle 
//Our job is to make classes with different methods
//from EnemyVehicle to work with the EnemyVehicle interface
public class EnemyTank implements EnemyVehicle {

	Random generator = new Random();
	
	@Override
	public void fireWeapon() {
		
		int damage = generator.nextInt(10) + 1;
		
		System.out.println(EnemyTank.class.getSimpleName() + " does " + damage + " damage");
	}

	@Override
	public void driveForward() {
		
		int movement = generator.nextInt(5) + 1;

		System.out.println(EnemyTank.class.getSimpleName() + " moves " + movement + " spaces");
	}

	@Override
	public void assignDriver(String driverName) {
		
		System.out.println(driverName + " is driving the " + EnemyTank.class.getSimpleName());
	}

}
