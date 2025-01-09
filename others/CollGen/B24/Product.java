package B24;

import java.util.HashMap;
import java.util.Scanner;

public class Product {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		HashMap<Integer, Integer> p = new HashMap<>();
	
		Scanner sc = new Scanner(System.in);
	
		while(true) {
		
			System.out.println("Enter product id: ");
			int productID = sc.nextInt();
		
			if(productID == -99) { 
				break;
			}
			
			System.out.println("Enter quantity: ");
			int quantity = sc.nextInt();
			
		}
	
	
		System.out.println("Enter product id, need to removed: ");
		int rproductID = sc.nextInt();
	
		if(p.containsKey(rproductID)) {
			
			p.remove(rproductID);
			System.out.println("productID removed successfully." + rproductID );
	
		}	
		else {
		
			System.out.println("productID is not found." + rproductID);
		}
	
	
		System.out.println("Total of products: " + p.size()	);
	
		for(Integer productID : p.keySet()) {
			
			System.out.print("remaining products: " + productID );
		}
		for(Integer quantity: p.keySet()) {
			
			System.out.println(quantity );
		}
	}
}
