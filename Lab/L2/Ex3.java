import java.util.Scanner;
public class Ex3{
	public static void main(String args[]){
	
	int length, width, height, volume;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input the length: ");
	length = sc.nextInt();
	
	System.out.println("Input the width: ");
	width = sc.nextInt();
	
	System.out.println("Input the height: ");
	height = sc.nextInt();
	
	volume = (length * width) * height;
	
	System.out.println("Volume is  " + volume );
	
	}
}