package B23;

import java.util.LinkedList;

public class Order {
	
	int orderID;
	String customerName;
	String orderDate;
	LinkedList<Product> pque;
	
	public Order() {
		
		pque = new LinkedList<>();
	}
	
	public Order(int orderID, String customerName, String orderDate) {
		super();
		this.orderID = orderID;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.pque = new LinkedList<>();
	}
	
	public void addProduct(Product p) {
		
		pque.add(p);
	}
	
	public void processOrder() {
		
		System.out.println("Order ID : " + orderID);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Order Date : " + orderDate);
		
		for(Product p : pque) {
			p.display();
		}
		
		System.out.println();
	}
	
	

}
