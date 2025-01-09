package DS23.d;

public class RollsRoys implements ICar{
	
	private static RollsRoys instance;
	
	private RollsRoys() {}
	
	public static  RollsRoys getInstance() {
		
		if (instance == null) {
			instance = new RollsRoys();
		}
		return instance;
	}
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Factory turns out RollsRoys Car");
		
	}

}
