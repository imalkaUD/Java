package ex2;
import java.util.Scanner;

public class DemoApp {

	public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberDigits,InvalidNumberStart{
		
		if(phoneNumber.length() != 10) {
			throw new InvalidPhoneNumberDigits();
		}
		
		if(phoneNumber.charAt(0) != '0') {
			throw new InvalidNumberStart();
		}
		
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Phone Number: ");
		String phoneNumber = sc.nextLine();
		
		try {
			validatePhoneNumber(phoneNumber);
			System.out.println("The phone number is valid.");
		}
		catch(InvalidPhoneNumberDigits | InvalidNumberStart e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
