package ex001;

public class MyMain {
	
	

    // Static method
    static void staticMethod() 
    {
        System.out.println("Static Method");
    }

    // Default constructor
    public MyMain() {
        System.out.println("Default Constructor");
    }
    
	  // Normal method
 // void normalMethod() 
	{
      System.out.println("Normal Method");
	}

    public static void main(String[] args) {
    	
    	// Calling the static method
        MyMain.staticMethod();
    
        // Creating an instance of MyMain
        MyMain m1 = new MyMain();
        
        // Calling the normal method
       // m1.normalMethod();
        
        // Calling the static method
       // MyMain.staticMethod();
    }
}