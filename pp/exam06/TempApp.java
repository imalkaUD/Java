package exam06;

import java.util.Scanner;
public class TempApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating objects of TemperatureConverter Class
		TemperatureConverter t1 = new TemperatureConverter();
		TemperatureConverter t2 = new TemperatureConverter();
		
		Scanner sc = new Scanner(System.in);
		
		//Input values
		System.out.print("Enter the temperature in celsius: ");
		double cel = sc.nextDouble();
		
		System.out.print("Enter the temperature in fahrenheit: ");
		double fah = sc.nextDouble();
		
		//Display values
		System.out.println(cel + " Celsius is equal to " + t1.celsiusToFahrenheit(cel) + " fahrenheit");
		System.out.println(fah + " Fahrenheit is equal to " + t2.fahrenheittocelsius(fah) + " celsius");
		
		//close scanner
		sc.close();
	}

}
