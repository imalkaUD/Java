package B24;

public class StudentManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentManager stm = new studentManager();
		
		stm.addStudent(new Student(1, "Kamal", 21, "President", 3.01));
		stm.addStudent(new Student(2, "amal", 21, "vice-President", 3.02));
		stm.addStudent(new Student(3, "Namal", 21, "student", 2.01));
		stm.addStudent(new Student(4, "Samal", 21, "student", 2.01));
		stm.addStudent(new Student(5, "Jamal", 21, "student", 2.07));
		
		stm.searchStudent(1);
		
		stm.updateStudentGPA(3, 2.05);
		
		stm.displayAllStudent();
		

	}

}
