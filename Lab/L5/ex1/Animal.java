package ex1;

abstract public class Animal {
	
	private String name;
	
	public Animal(String name) 
	{
		this.name = name;
	}
	public Animal() {
		
		System.out.println("Animal constructor called");
		
	}
	
	public abstract String speak();
	
	public void display() 
	{
		System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	}
	
	


}
