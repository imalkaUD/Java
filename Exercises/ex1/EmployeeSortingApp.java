package ex1;

import java.util.PriorityQueue;

public class EmployeeSortingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Employee> pq = new PriorityQueue<Employee>();
		
		pq.add(new Employee(1 ,"Kamal", 3));
		pq.add(new Employee(2 ,"Namal", 5));
		pq.add(new Employee(3 ,"Samal", 10));
		
		for(Employee value :pq) {
			System.out.println(value);
		}
		
		PriorityQueue<Employee> filterpq = new PriorityQueue<Employee>();
		
		for(Employee value :pq) {
			
			if(value.hours > 15) {
				filterpq.add(value);
			}
		}
		
		for(Employee value :filterpq) {
			System.out.println(value);
		}
		
	}
	

}
