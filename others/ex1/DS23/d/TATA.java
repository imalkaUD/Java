package DS23.d;

public class TATA implements IBus{
	
	private static TATA instance;
	
	private TATA() {}
	
	public static  TATA getInstance() {
		
		if (instance == null) {
			instance = new TATA();
		}
		return instance;
	}
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Factory turns out TATA Car");
		
	}

}
