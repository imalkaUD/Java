package exam07;

import java.util.Scanner;
public class MathOperation {
	

	
	public void drawMultiplicationTable(int no, int range) {
		
		for(int i = 1 ; i <= range ; i++) {
			
			System.out.println(no +  " * " + i + " = "  + (no * i) );
			
		}
		
	}
	
	public int factorial(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a postive integer: ");
		int pno = sc.nextInt();
		
		int result = 1;
		
		for(int i = 1; i<=pno; i++) {
			
			result *= i;
		}
		
		return result;
		
	}
	
	
}
