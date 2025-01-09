package exam05;

public class Employee {
	
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void displayInfo() {
		
		System.out.println("Employee Name is "+ this.name);
		System.out.println("Salary is " + this.salary);
	}
	

}
