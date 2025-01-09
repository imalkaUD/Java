package exam;

public class Electronic extends Product{
	
	String brand;
	String model;
	
	public Electronic(int pproductId, String pname, double pprice, String brand, String model) {
		super(pproductId, pname, pprice);
		this.brand = brand;
		this.model = model;
	}
	
	public void display() {
		
		System.out.println("Product ID is " + this.productId);
		System.out.println("Name is " + this.name);
		System.out.println("Price is " + this.price);
		System.out.println("Brand is " + this.brand);
		System.out.println("Model is " + this.model );
	}
	
	

}
