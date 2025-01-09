package DS23.d;

public class Fuso implements IBus{
	
	private static Fuso instance;
	
	private Fuso() {}
	
	public static  Fuso getInstance() {
		
		if (instance == null) {
			instance = new Fuso();
		}
		return instance;
	}
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Factory turns out Fuso Car");
		
	}

}
