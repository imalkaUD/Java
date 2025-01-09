package exam07;

public class MathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation m1 = new MathOperation();
		
		m1.drawMultiplicationTable(5, 10);
		
		int fResult = m1.factorial();
		System.out.println("The factorial is: "+ fResult);
	

	}

}
