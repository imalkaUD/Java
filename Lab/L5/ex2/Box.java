package ex2;

public class Box implements ICompute {
	
	private int length, width, height;
	private int volume;
	
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	
	public void calculate() {
		
		volume = length * width * height;
		System.out.println("Volume of the box is: " + volume);
		
	};
	public void display() {
		
		System.out.println("Display method from ICompute");
	};
	
	


}
