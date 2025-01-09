package DS23.d;

public class Benz implements ICar{
	
	private static Benz instance;
	
	private Benz() {}
	
	public static  Benz getInstance() {
		
		if (instance == null) {
			instance = new Benz();
		}
		return instance;
	}
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Factory turns out Benz Car");
		
	}

}
