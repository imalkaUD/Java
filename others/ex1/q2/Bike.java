package q2;

public class Bike extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0 ; i<5 ; i++ ) {
			
			System.out.println("Bike is raicing");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
