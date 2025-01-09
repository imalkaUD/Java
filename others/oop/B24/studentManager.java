package B24;

import java.util.ArrayList;

public class studentManager {
	
	ArrayList<Student> studentList;

	public studentManager() {
		
		studentList = new ArrayList<Student>();
		
	}
	
	public void addStudent(Student student) {
		
		studentList.add(student);
	}
	
	public void searchStudent(int studentId) {
		
		for(Student student : studentList) {
			
			if(student.getStudentId() == studentId) {
				
				student.displayStudentDetails();
				
				return;
			}
		}
	}
	
	public void updateStudentGPA(int studentId, double newGPA) {
		
		for(Student student : studentList) {
			
			if(student.getStudentId() == studentId) {
				
				student.updateGPA(newGPA);
				
				System.out.println("updated student id: " + studentId);
				
				return;
			}
		}
		
		
	}
	
	
	public void displayAllStudent() {
		
		for(Student student : studentList) {
			
			student.displayStudentDetails();
		}
		
	}
	
	

}
