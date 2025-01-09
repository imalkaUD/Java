package exam05;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartTimeEmployee pe1 = new PartTimeEmployee("Kamal", 100000, 10);
		PartTimeEmployee pe2 = new PartTimeEmployee("Nimal", 80000, 8);
		
		pe1.displayEmpnfo();
		System.out.print("\n");
		pe2.displayEmpnfo();

	}

}
