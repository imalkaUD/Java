package exam;

public class Product {
	
	int productId;
	String name;
	double price;
	
	public Product(int pproductId, String pname, double pprice) {
		super();
		this.productId = pproductId;
		this.name = pname;
		this.price = pprice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void displayDetails() {
		System.out.println("Product ID is " + this.productId);
		System.out.println("Name is " + this.name);
		System.out.println("Price is " + this.price);
	}


	
	
	

}
