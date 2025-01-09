package DS23;

public abstract class DesignSelector {
	
	protected IDrawableLines il;
    protected IDrawableShapes is;
	

	
	public void setdrawableLines(IDrawableLines il) {
		
		this.il = il;
		
	}
	
	public void setdrawableShapes(IDrawableShapes is) {
		
		this.is = is;
		
	}
	
	public void designLine(){
		il.drawableLines(getRobotType());
	}
	
	public void designShapes(){
		is.drawableShapes(getRobotType());
	}
	
	
	protected abstract String getRobotType();
	

}
