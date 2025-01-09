package DS23.d;

public class CarFactory implements VehicleFactory{
	
	private static CarFactory instance;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		
		if(instance == null) {
			
			instance = new CarFactory();
		}
		
		return instance;
	}
	

	public ICar getModel(String vehicle) {
		
		if(vehicle.equalsIgnoreCase("BMW")) {
			return BMW.getInstance();
		}
		
		else if(vehicle.equalsIgnoreCase("BENZ")) {
			return Benz.getInstance();
		}
		
		else if(vehicle.equalsIgnoreCase("ROLLSROYS")) {
			return RollsRoys.getInstance();
		}
		
		else {
			return null;
		}
	}
		
	@Override
	public IBus getbus(String vehicle){
			
		return null;
	}	
	
}
