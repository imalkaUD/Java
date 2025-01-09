package ex2;

public class InvalidNumberStart extends Exception{
	
	public InvalidNumberStart() {
		super("The phone number must start with 0.");
	}
	
}
