package ex1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Student s1 = new Student();//using default constructor --1
		s1.name = "Nimal";
		s1.ditNo = "A001";
		s1.address = "Malabe";
		
		Student s2 = new Student();
		s2.name = "Kamal";
		s2.ditNo = "A002";
		s2.address = "Metro";*/
		
		//Student s1 =  new Student("Imalka", "B01", "Kaduwela");//overloaded constructor  --2
		//Student s2 =  new Student("Malsha", "B02", "Gampaha");
		
		Student s1 = new Student(); //setters & getters --3
		s1.setName("Sadu");
		s1.setDitNo("C01");
		s1.setAddress("Kanthale");
		
		Student s2 = new Student();
		s2.setName("Nadu");
		s2.setDitNo("C02");
		s2.setAddress("Trincomalee");

		
		//--1   --2   --3
		//s1.name  -1
		//s1.name  -2
		//s1.getName()  -3
		/*System.out.println("Name: " + s1.getName() + "\nDitNo: " + s1.getDitNo() + "\nAddress: " + s1.getAddress() + "\n");
		
		System.out.println("Name: " + s2.getName() + "\nDitNo: " + s2.getDitNo() + "\nAddress: " + s2.getAddress());
		*/
		
		// --4
		System.out.println(s1.getDetails());
		System.out.println(s2.getDetails());
		
	}

}
