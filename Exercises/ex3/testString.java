package ex3;
import java.util.Scanner;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		StringObjectives ob = new StringObjectives();
		
		
		String reInput = ob.ReverseString(input);
		System.out.println("Reversed String: " + reInput);
		
		
		
		int vowelCount = ob.countVowels(input);
		System.out.println("Numbers of vowels: " + vowelCount);
		
		
		sc.close();
	}

}
