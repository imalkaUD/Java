package DS23.d;

public class BusFactory implements VehicleFactory{
	
	private static BusFactory instance;
	
	private BusFactory() {}
	
	public static BusFactory getInstance() {
		
		if(instance == null) {
			
			instance = new BusFactory();
		}
		
		return instance;
	}
	
	public  IBus getModel(String vehicle) {
		
		if(vehicle.equalsIgnoreCase("VOLVO")) {
			return Volvo.getInstance();
		}
	
		else if(vehicle.equalsIgnoreCase("FUSO")) {
			return Fuso.getInstance();
		}
		
		else if(vehicle.equalsIgnoreCase("TATA")) {
			return TATA.getInstance();
		}
		
		else {
			return null;
		}
	}
	
	@Override
	public ICar getcar(String vehicle){
			
		return null;
	}

}
