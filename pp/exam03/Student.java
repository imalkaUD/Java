package exam03;

public class Student {
	
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void displayInfo() {
		
		System.out.println("Name is " + this.name);
		System.out.println("Age is " + this.age);
	}
	
	
	

}
