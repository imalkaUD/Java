package question1;

public class Telescope implements Runnable{

	@Override
	public  void run() {
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("Telescope is observing");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
