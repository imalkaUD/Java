package exam02;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the objects of the Book class & assign them
		Book b1 = new Book ("Gam Peraliya", "Mahagama sekara", 102);
		Book b2 = new Book ("Sirith Maldama", "S. Mahinda himi", 202);
		
		//display outputs
		b1.print();
		System.out.print("\n");
		b2.print();

	}

}
