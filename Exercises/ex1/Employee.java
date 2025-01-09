package ex1;
import java.util.PriorityQueue;

public class Employee {
	
	int id;
	String name;
	int hours;
	
	public Employee() {
		
	}
	public Employee(int id, String name, int hours) {
		this.id = id;
		this.name = name;
		this.hours = hours;
	}
	
	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.hours, other.hours);
	}
	
	@Override
	public String toString() {
		return "Employeee ID:" + id +  ", Name:" + name +  ", Hours: " + hours;
	}

}
