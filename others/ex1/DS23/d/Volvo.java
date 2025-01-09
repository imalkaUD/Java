package DS23.d;

public class Volvo implements IBus{
	
	private static Volvo instance;
	
	private Volvo() {}
	
	public static  Volvo getInstance() {
		
		if (instance == null) {
			instance = new Volvo();
		}
		return instance;
	}
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Factory turns out Volvo Car");
		
	}

}
