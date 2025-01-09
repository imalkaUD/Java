package mid;

//public class mid {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5/0;
		System.out.println("a");
		
		
	}	

}*/
/*//class Exc2 {
	 public static void main(String args[]) {
	 int d, a;
	 try { // monitor a block of code.
	 d = 0;
	 a = 42 / d;
	 System.out.println("This will not be printed.");
	 } catch (ArithmeticException e) { // catch divide-by-zero error
	 System.out.println("Exception: " + e);
	 System.out.println("Division by zero.");
	 }
	 }
	}*/
	
//	class MultipleCatches {
	/*	 public static void main(String args[]) {
		 try {
		 int a = args.length;
		 System.out.println("a = " + a);
		 int b = 42 / a;
		 int c[] = {1};
		 c[42] = 99;
		 } catch (ArithmeticException e) {
		 System.out.println("Divide by 0: " + e);
		 } catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("Array index oob: " + e);
		 }
		 System.out.println("After try/catch blocks.");
		 }
		}*/
//import java.io.*; 
//public class mid {
/*//class TestFinallyBlock{
	public static void main(String args[]){
		try{
			int data=25/0;
			System.out.println(data);
		} catch(ArithmeticException e){
			System.out.println(e);
		} finally{
			System.out.println("finally block is always executed");
			System.out.println("rest of the code...");
		}
	}
}*/
	
	
	//import java.io.*; 
	//class Error03{ 
/*	 public static void main(String[] a) throws IOException{ 
	BufferedReader in = new BufferedReader( new InputStreamReader (System.in)); 
	String text=""; System.out.print("Enter an integer value : "); 
	text = in.readLine(); int num = Integer.parseInt(text); 
	System.out.println("You inserted "+num); 
	 }
	}
*/
	
	
	
/*	class MyException extends Exception { 
		 MyException (String message) { 
		 super(message); 
		 } 
		} 
		class mid { 
		 public static void main (String args[ ]) { 
		 int x = 5, y = 1000; 
		 try { 
		 float z = (float) x / (float) y;
		 if(z < 0.01) { 
		 throw new MyException ("Number is too small") ; 
		 } 
		 } catch (MyException e) { 
		 System.out.println ("Caught my exception"); 
		 System.out.println(e.getMessage ()); 
		 } finally { 
		 System.out.println ("I am always here") ; 
		 } 
		 } 
		}*/


public class mid {
	public static void main(String args[]) {
		int x = 5; 
		int y = 10;
		boolean b = x > 0;

		if (b = true) {
			System.out.print(x);
		} else {
			System.out.print(y);
		}
	}
}