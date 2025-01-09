package exam03;

public class Course extends Student{
	
	String CourseName;

	public Course(String name, int age, String courseName) {
		super(name, age);
		CourseName = courseName;
	}
	
	public void displayCourseIno() {
		
		System.out.println("Name is " + this.name);
		System.out.println("Age is " + this.age);
		System.out.println("Course Name is " + this.CourseName);
	}

}
