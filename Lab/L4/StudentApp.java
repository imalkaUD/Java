package lab4;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] student = new Student[5];
		
		student[0] = new Student("John", "IT" , "071*******");
		student[1] = new Student("Kamal", "IT" , "071*******");
		student[2] = new Student("Amal", "IT" , "071*******");
		student[3] = new Student("Nimal", "IT" , "071*******");
		student[4] = new Student("Supun", "IT" , "071*******");
		
		for(Student st : student) {
			st.print();	
		}
		
		System.out.println("Next Student ID will be : " + Student.getNextStudentId());

	}

}
