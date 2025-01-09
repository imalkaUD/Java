package DS23.d;

public class VehicleProducer {
	
	public static VehicleFactory getVehicle(String choice) {
		
		if(choice.equalsIgnoreCase("CAR")){
			return  CarFactory.getInstance();
		}
		
		else if(choice.equalsIgnoreCase("Bus")){
			return BusFactory.getInstance();
		}
		
		else {
			return null;
		}
	}
		
		
		
	
}
