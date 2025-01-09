package mid;
class Cal{
	public int val;
	private int val2;
	
	void pass(int res, int res1 ) {
		val = res +1;
		val2 = res1;
	}
	void print() {
		System.out.println("" + res1);
		
	}
public class access_specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal c = new Cal();
		
		c.pass(2,  3);
		
		System.out.println(c.res);
		
		c.print();
		

	}

}
