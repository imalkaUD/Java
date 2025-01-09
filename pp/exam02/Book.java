package exam02;

public class Book {
	
	//Attributes of the class
	String title;
	String author;
	int pageCount;
	
	//Overloaded Constructor
	public Book(String title, String author, int pageCount) {
		super();
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}
	
	//Setters and Getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	//Method of isShortBook
	public boolean isShortBook() {
		
		//Condition
		if (pageCount < 200) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	//Printing Details
	public void print() {
		System.out.println("Title is " + this.title);
		System.out.println("Author is " + this.author);
		System.out.println("Page count is " + this.pageCount);
		
	}
	

}
