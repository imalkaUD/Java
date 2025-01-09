package ex4;

public class InvalidInputExcepton extends Exception{
	
	public InvalidInputExcepton(){
		
		super("Invalid Age: age should be postive integer lessthan or equal to 120.");
	}
	

}
