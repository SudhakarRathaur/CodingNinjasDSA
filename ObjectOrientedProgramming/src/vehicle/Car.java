package vehicle;

public  class Car extends Vehicle {
	
	int numGears;
	boolean isConvertible;
	
	public Car() {
		super(100);
		System.out.println("Car Constructor");
}

	
	public void printCar() {
	super.print();
	System.out.println("Vehicle numGears : " + numGears );
	System.out.println("Vehicle isConvertible : " + isConvertible );
	
	}


	@Override
	public boolean isMotorised() {
		// TODO Auto-generated method stub
		return false;
	}
	
} 
