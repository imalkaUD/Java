package DS23;

public class DashLines implements IDrawableLines{
	
    private static DashLines instance;

    private DashLines() {}

    public static synchronized DashLines getInstance() {
    	
    	if(instance == null) {
    		instance = new DashLines();
    	}
        return instance;
    }
	
	@Override
	public void drawableLines(String robatType) {
		// TODO Auto-generated method stub
		
		System.out.println("Dash lines on clothes by " + robatType);
		
	}
	

	


}
