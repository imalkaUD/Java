//ex1

import java.util.Scanner;
 
public class Ex1{
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++){
			fac*=i;
		}
		System.out.println("Factorial of "+n+" : "+fac);
	}
}

import java.util.Scanner;
public class tute1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fact=1,j=n;
		while(n>0){
			fact*=n;
			n--;
		}
		System.out.println("Factorial of "+j+" is "+fact);
	}
}

[9:01 AM] FERNANDO W.S.N.J. it23259102
import java.util.Scanner;
 
public class Ex1 {
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num = scanner.nextInt();
		
		int fact = 1;
		
		if (num > 0)
		{
			for (int i = 0; i < num; i++)
			{
				fact = fact * (num - i);
			}
			
			System.out.print("\nFactorial of " + num + " = " + fact);
		}
		
		else
		{
			System.out.print("\nInvalid number");
		}
		
		scanner.close();
		
	}
 
}

[9:15 AM] HAPUARACHCHI H.D.V.C it23177000
import java.util.Scanner;
 
public class Ex2{

	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);

		int n=0;

		int sum=0;

		int count=0;
 
		while(n>=0){

			count++;

			sum+=n;

			System.out.print("Enter number "+count+" :");

			n = sc.nextInt();

		}
 
		float avg=(float) sum/(count-1);

		System.out.println("Average : "+avg);

	}

}
 
[9:16 AM] SONALI G.D.D it23211896
import java.util.Scanner;

public class Ex2{

	public static void main(String args[]){

		Scanner scan=new Scanner(System.in);

		int count=0,sum=0;

		while(true){

			System.out.print("Enter Number :");

			int n=scan.nextInt();

			if(n<0){

				break;

			}

			else{

				sum+=n;

				count++;

			}

		}

		System.out.println("Average of number series" + (double)(sum/count));

	}

}

 
 
 