import java.util.Scanner;
class EvenOddNumber{
	public boolean findEvenOrOdd(int i){
		 
		if(i % 2 == 0){
			return true;
		}else{
			return false;
		}
	
	}
}
	
	
public class Demo{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	EvenOddNumber num = new EvenOddNumber();
	
	System.out.println("Enter a number: ");
	int number = sc.nextInt();
	
	boolean result = num.findEvenOrOdd(number);
	
	if(result == true ){
		System.out.println("This is an even number");
	}
	else{
		System.out.println("This is an odd number");
	}
	}
}