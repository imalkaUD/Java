package my;

public class InvalidPhoneNumberStart extends Exception{
	
	public InvalidPhoneNumberStart() {
		super("The phone no must start with 0.");
	}
}
