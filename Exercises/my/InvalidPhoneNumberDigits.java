package my;

//exception for invalid number of digits
public class InvalidPhoneNumberDigits extends Exception{
	
	public InvalidPhoneNumberDigits() {
		super("The phone no must have 10 digits.");
	}
}
