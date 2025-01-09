package mid;
class A{
	int min;
	int max;
	 public A( int a, int b) {
		 this.min = a;
		 this.max = b;
		 
	 }
	 
	 public void updateMinMax(A a) {
		 if(a.min < this.min)
			 this.min = a.min;
		 if(a.max < this.max)
			 this.max = a.max;
		 
	 }
	 public  void printinMax() {
		 System.out.print(this.min + ":" + this.max + ",");
	 }
}
public class Man {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1= new A (2,4);
		A a2 = new A (1,3);
		
		a1.updateMinMax(a2);
		a2.updateMinMax(a1);
		
		a1.printinMax();
		a2.printinMax();

	}

}
