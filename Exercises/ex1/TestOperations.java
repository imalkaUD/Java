package ex1;
import java.util.ArrayList;
import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> no = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integers: ");
		
		for(int i=0 ; i<5 ; i++) {
			
			int number = sc.nextInt();
			no.add(number);
			
		}
		System.out.println("Input: "+ no);
				
		ArrayOperations.removeOddNumbers(new ArrayList<>(no));
		Arrayoperations.doubleEvenNumbers(new ArrayList<>(no));

	}
}
