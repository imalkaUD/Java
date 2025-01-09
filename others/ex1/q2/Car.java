package q2;

public class Car extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0 ; i<5 ; i++ ) {
			
			System.out.println("Car is raicing");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
