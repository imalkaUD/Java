package q2;

public class RaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		
		Bike b = new Bike();
		
		
		c.start();
		
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		b.start();

	}

}
