package B23;

import java.util.Scanner;

public class Product {
	
	int productID;
	String name;
	double price;
	int stockQuentity;
	
	public Product() {};
	
	public Product(int productID, String name, double price, int stockQuentity) {
		super();
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.stockQuentity = stockQuentity;
	}
	
	public void read() {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter productID : ");
		productID = sc.nextInt();
		
		System.out.println("Enter name : ");
		name = sc.nextLine();
		
		System.out.println("Enter price : ");
		price =sc.nextDouble();
		
		System.out.println("Enter stockQuentity : ");
		stockQuentity = sc.nextInt();
		
	}
	
	public void display() {
		
		System.out.println("Product ID : " + productID);
		System.out.println("Product Name : " + name);
		System.out.println("price : " + price);
		System.out.println("stockQuentity : " + stockQuentity);
		System.out.println();	
		
	}

}
