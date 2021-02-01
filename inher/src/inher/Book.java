package inher;

public class Book extends publication{

	private String ISBN;
	private String publisher;
	 
	Book(){
		
	}
	

	public Book(String author, int noOfPages, String title, int year,String iSBN, String publisher) {
		super(author, noOfPages, title, year);
		
		this.ISBN = iSBN;
		this.publisher = publisher;
		
	}

	public Book(String iSBN, String publisher) {
		
		this.ISBN = iSBN;
		this.publisher = publisher;
	}


	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}


	@Override
	public String toString() {
		return String.format("%s%d%s%d%s%s",author,noOfPages,title,year,ISBN,publisher);
	}
 
	
/*("Book [getPublisher()=" + getPublisher() + ", getISBN()=" + getISBN() + ", getAuthor()=" + getAuthor()
		+ ", getNoOfPages()=" + getNoOfPages() + ", getTitle()=" + getTitle() + ", getYear()=" + getYear()
		+ "]")*/

	
}
