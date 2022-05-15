package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Break if needed");	
	}
	public void applyGear() {
		System.out.println("Change Gear according to speed");
	}
	public void switchOnAc() {
		System.out.println("Switch on AC if weather is too sunny");
	}
	public void applyAccelerate() {
		System.out.println("Use accelerate to speed up the car");
	}
	public static void main(String[] args) {
		Car honda = new Car();
		honda.applyBreak();
		honda.applyAccelerate();
		honda.applyGear();
		honda.switchOnAc();	

	}

}
