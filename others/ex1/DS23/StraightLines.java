package DS23;

public class StraightLines implements IDrawableLines{
	
    private static StraightLines instance;

    private StraightLines() {}

    public static synchronized StraightLines getInstance() {
    	
    	if(instance == null) {
    		instance = new StraightLines();
    	}
        return instance;
    }
	
	@Override
	public void drawableLines(String robatType) {
		// TODO Auto-generated method stub
		
		System.out.println("Straight lines on clothes by " + robatType);
		
	}
	


}
