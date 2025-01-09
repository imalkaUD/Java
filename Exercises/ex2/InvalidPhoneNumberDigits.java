package ex2;

class InvalidPhoneNumberDigits extends Exception{
	
	public InvalidPhoneNumberDigits() {
		super("The phone numbermust have exatly 10 digits.");
	}
	

}
