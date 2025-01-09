package lab4;

public class Student {
	private int studentId;
	private String name;
	private String degree;
	private String mobile;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	private static int max = 100; 
	
	public Student(String name, String degree, String mobile) {
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		this.studentId = ++max;
	}
	
	public void print() {
		System.out.println("Student ID: " + this.studentId  + "\n" + 
				"Name: " + this.name  + "\n" +
				"Degree: " + this.degree  + "\n" +
				"Mobile: " + this.mobile  + "\n");
	}
	
	public static int getNextStudentId() {
		return max+1;
	}
	

}
