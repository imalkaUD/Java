package ex4;
import java.util.Scanner;

public class GreetingValidator {
	
	public static void validateAge(int age) throws InvalidInputExcepton{
		
		if( age <= 0 | age > 120) {
			throw new InvalidInputExcepton();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
				
		try {
			validateAge(age);
			System.out.println( name + " u are" + age + "years old");
		}
		catch(InvalidInputExcepton e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Plz enter valid integer for age: ");
		}
		
		sc.close();

	}

}
