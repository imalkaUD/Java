package exam04;

public class MotorCycle extends Vehicle{
	
	int engineCapacity;

	public MotorCycle(String model, double rentalPricePerDay, int engineCapacity) {
		super(model, rentalPricePerDay);
		this.engineCapacity = engineCapacity;
	}
	
	

}
