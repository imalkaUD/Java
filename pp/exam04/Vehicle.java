package exam04;

public class Vehicle {
	
	String model;
	double rentalPricePerDay;
	
	public Vehicle(String model, double rentalPricePerDay) {
		super();
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
	}
	
	public double calculateRentalCost(int days){
		
		 return  rentalPricePerDay * days;
		 
	
	}
	

}
