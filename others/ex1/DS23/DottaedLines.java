package DS23;

public class DottaedLines implements IDrawableLines{
	
    private static DottaedLines instance;

    private DottaedLines() {}

    public static synchronized DottaedLines getInstance() {
    	
    	if(instance == null) {
    		instance = new DottaedLines();
    	}
        return instance;
    }
	
	@Override
	public void drawableLines(String robatType) {
		// TODO Auto-generated method stub
		
		System.out.println("Dotted lines on clothes by " + robatType);
	}
	


}
