package question1;

public class ObservationController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Telescope t = new Telescope();
		Thread th = new Thread(new Telescope());
		
		//Satelite s = new Satelite();
		Thread sh = new Thread (new Satelite());
		
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		sh.start();
		
		try {
			sh.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Both obersvation begin again simultaniously :-");
		
		//Telescope t1 = new Telescope();
		Thread th1 = new Thread(new Telescope());
		
		//Satelite s1 = new Satelite();
		Thread sh1= new Thread(new Satelite());
		
		th1.start();
		sh1.start();
	}

}
