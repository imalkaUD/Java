package my;
import java.util.Scanner;
public class DemoApp {
	
	//validatetelNo method
	public static void validatetelNo(String telno) throws InvalidPhoneNumberDigits , InvalidPhoneNumberStart{
		
		
		if(telno.length() != 10) {
			throw  new InvalidPhoneNumberDigits();
		}
		
		if(telno.charAt(0) != '0') {
			throw new InvalidPhoneNumberStart();
		}
	}
	
	
	//main method
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the telephonr no: ");
		String telno = sc.nextLine();	
		
		
	
		try {
			//validate tel no
			validatetelNo(telno);
			System.out.println("Valid Phone no");
		}
		catch(InvalidPhoneNumberDigits | InvalidPhoneNumberStart e) {
			//handle exception
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
