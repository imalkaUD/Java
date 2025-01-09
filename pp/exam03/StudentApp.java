package exam03;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c1 = new Course("Kamal", 23, "Software Engneering");
		Course c2 = new Course("Nimal", 19, "Data Science");
		
		c1.displayCourseIno();
		System.out.print("\n");
		c2.displayCourseIno();

	}

}
