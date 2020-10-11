package Bridge;

//Implementor

// Here is the abstract class of the implementor; 
// note that this is not referring to the abstraction i.e. remote button

// the implementor has subclasses that extend the abstract class to cater to different devices

// the entertainment device has some base logic and attributes including base remote button functions
// the bridge pattern connects the implementor to the abstraction i.e. remote button,  
// and so allows for extension of the implementor for changes not relating to the device itself but to the abstraction,
// i.e. changes to the remote interface but not to the device per se

// This allows for increased flexibility since now any combination of implementor and abstraction can be realised

public abstract class EntertainmentDevice {
	
	public int deviceState;
	
	public int maxSetting;
	
	public int volumeLevel = 0;
	
	public abstract void buttonFivePressed();
	
	public abstract void buttonSixPressed();
	
	public void deviceFeedback() {
		
		if(deviceState > maxSetting || deviceState < 0) { deviceState = 0; }
		
		System.out.println("On Channel " + deviceState);
		
	}
	
	public void volumeUpPressed() {
		
		volumeLevel++;
		
		System.out.println("Volume at: " + volumeLevel);
		
	}
	
	public void volumeDownPressed() {
		
		volumeLevel--;
		
		System.out.println("Volume at: " + volumeLevel);
		
	}
	
}
