package my;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student() {
		
	}
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return "ID: " + id + "  Name: " + name + "  Marks: " + marks;
	}

}
