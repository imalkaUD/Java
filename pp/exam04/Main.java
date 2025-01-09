package exam04;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("Lambogini", 100000, 2);
		MotorCycle m1 = new MotorCycle("Sccoter", 78000, 1000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No of Days: ");
		int days = sc.nextInt();
		
		System.out.println("Rent a Car");
		System.out.println("Model: " + c1.model);
		
		System.out.println("Rent Per Day:  "+ c1.rentalPricePerDay);
		
		System.out.println("Total Cost is "  + (c1.calculateRentalCost(days)));
		
		
		
		System.out.println("Rent a Motor Cycle");
		System.out.println("Model: " + m1.model);
		
		System.out.println("Rent Per Day:  "+ m1.rentalPricePerDay);
		
		System.out.println("Total Cost is "  + (m1.calculateRentalCost(days)));
		
		
		sc.close();

	}

}
