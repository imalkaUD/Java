package exam;

public class Clothing extends Product{
	
	String size;
	String colour;
	
	public Clothing(int pproductId, String pname, double pprice, String size, String colour) {
		super(pproductId, pname, pprice);
		this.size = size;
		this.colour = colour;
	}
	
	public void display() {
		
		System.out.println("Product ID is " + this.productId);
		System.out.println("Name is " + this.name);
		System.out.println("Price is " + this.price);
		System.out.println("Size is " + this.size);
		System.out.println("Colour is " + this.colour);
	}
	
	
	
	

}
