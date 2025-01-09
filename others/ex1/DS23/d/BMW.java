package DS23.d;

public class BMW implements ICar{
	
	private static BMW instance;
	
	private BMW() {};
	
	public static BMW getInstance() {
		
		if (instance == null) {
			instance = new BMW();
		}
		
		return instance;
	}
	
	
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Factory turns out BMW Car");
		
	}

}