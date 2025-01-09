package ex2;

public class Person implements ICompute{
	
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	public Person(String name, double basicSal, double otRate, double otHrs) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		
	}
	
	public void calculate() {
		netSal = basicSal + (otHrs + otRate);
		System.out.println("Person's net salary is: " + netSal);
	};
	public void display() {
		System.out.println("Person name is: " + name);
	};
	
	


}
