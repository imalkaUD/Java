package B23;

public class OrderProcessingApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		Order o1 = (new Order(1, "Kamal", "01-02-2023"));
		Order o2 = (new Order(2, "Namal", "25-02-2023"));
		
		p1.read();
		p2.read();
		p3.read();
		p4.read();
		
		o1.addProduct(p4);
		o2.addProduct(p3);
		
		o1.processOrder();
		o2.processOrder();
		
	

		
		
	}

}
