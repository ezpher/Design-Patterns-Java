package Bridge;

//Concrete Implementor

//Here is an implementation of the EntertainmentDevice abstract class.

public class TV extends EntertainmentDevice {
	
	public TV(int newDeviceState, int newMaxSetting){
		
		deviceState = newDeviceState;
		
		maxSetting = newMaxSetting;
		
	}
	
	public void buttonFivePressed() {
		
		System.out.println("Channel Down");
		
		deviceState--;
		
	}

	public void buttonSixPressed() {
		
		System.out.println("Channel Up");
		
		deviceState++;
		
	}
	
}
