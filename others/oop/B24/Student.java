package B24;

public class Student {
	
	int studentId;
	String name;
	int age;
	String major;
	double gpa;
	
	public Student() {}
	
	public Student(int studentId, String name, int age, String major, double gpa) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.major = major;
		this.gpa = gpa;
	}
	
	
	public void updateGPA(double newGPA) {
		
		this.gpa = newGPA;
	}
	
	public void displayStudentDetails() {
		
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
		System.out.println("Student Major : " + major);
		System.out.println("Student GPA : " + gpa);
		System.out.println();
		
	}

	public int getStudentId() {
		return studentId;
	}


	
	
	

}
