package mid;
class Fruit{
	public void printDetails() {
		System.out.println("This is a fruit");
	}
}

class Apple extends Fruit{
	public void printDetails() {
		
		System.out.print("This is a fruit");

	}
	
	public void nutrision() {
		System.out.print("C , P, C, ect");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f1 = new Fruit()
		fruit f2 = new Apple();
		
		f2.nutrision();
		f2.printDetails();

	}

}
