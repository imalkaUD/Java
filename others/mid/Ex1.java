package mid;
class AK {
	public AK() {
		System.out.println("A()");
	}
}
class B extends AK{
	public B() {
		System.out.println("B()");
	}
	public B(int no) {
		System.out.println("B(int no)");
	}
}
class C extends B{
	public C() {
		super(20);
		System.out.println("C()");
	}
	public C(int no) {
		this();
		System.out.println("C(int no)");
	}
}
class D extends C{
	public D() {
		super(20);
		System.out.println("D()");
	}

}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new D();
	}

}
