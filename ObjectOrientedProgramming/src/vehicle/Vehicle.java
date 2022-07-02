package vehicle;

public abstract class Vehicle {
	String color;
	int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("Vehicle constructor");
	}
	
	public abstract boolean isMotorised();
	
	
	
	public void print() {
		System.out.println("Vehicle color : " + color );
		System.out.println("Vehicle maxSpeed : " + maxSpeed );
		
		
	}
}
