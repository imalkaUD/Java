package exam05;

public class PartTimeEmployee extends Employee{
	
	int otHrs;

	public PartTimeEmployee(String name, double salary, int otHrs) {
		super(name, salary);
		this.otHrs = otHrs;
	}
	
	public void displayEmpnfo() {
		
		System.out.println("Employee Name is "+ this.name);
		System.out.println("Salary is " + this.salary);
		System.out.println("OT Hours: " + this.otHrs);
	}
	

}
