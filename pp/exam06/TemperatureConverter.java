package exam06;

public class TemperatureConverter {
	
	//Attribute of Class
	double temperature;
	
	//Default Constructor
	public TemperatureConverter() {
		
		temperature = 0.0;
	}
	
	//Getter Method
	public double getTemperature() {
		return temperature;
	}
	
	
	public double celsiusToFahrenheit(double celsius) {
		
		return  (celsius * (9/5.0)) + 32;
	}
	
	public double fahrenheittocelsius(double fahrenheit) {
		
		return (fahrenheit - 32) * (5/9.0);
	}
	
	

}
