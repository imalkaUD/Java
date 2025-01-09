package mid;
class Book{
	String name;
	String isbn;
	
	public Book(String name, String isbn) {
		this.name = name;
		this.isbn = isbn;
	}
	
	@override
	public String toString() {
		return "Book Name = " + this.name + ", Book ISBN = " + this.isbn;
	}
}
public class Ex3 {

	
		// TODO Auto-generated method stub
		
		static Book book3;
		
		static Book swapParam(Book book1, Book book2) {
			book3 = book1;
			book1 = book2;
			book2 = book3;
			
			System.out.println(book1);
			System.out.println(book2);
			return  book3;
			
			
			
		}
		public static void main(String[] args) {
			
			Book book1 = new Book("THE other lady vaniss", "110 - 23456");
			Book book2 = new Book("Harry potter", "220 - 23456");
			book2 = swapParam(book1, book2);
			
			System.out.println(book1);
			System.out.println(book2);
			
		}

}
