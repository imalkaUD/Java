package mid;
class Demo{
	int x;
	int y;
	
	
	public Demo(int a, int b) {
		
		this.x = a;
		this.y = b;
	}

	public Demo nextDemo() {
		Demo c = new Demo ((this.a*2)  (this.b+2));
		return c;
		}
	
	public void printValues() {
		System.out.print(this.a + ":" + this.b + ",");
		

	}
}
public class Mn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo(2, 4);
		Demo d2;
		
		d2 = d1.nextDemo();
		
		d2.printValues();
		d1.printValues();
	}

}
