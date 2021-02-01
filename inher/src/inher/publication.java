package inher;

public class publication    {
	protected String author;
	protected int noOfPages ;
	protected String title;
	protected int year;
	

 public publication()  {
	 
 }
 
 public publication(String author, int  noOfPages, String title , int year) {
	this.setAuthor(author);
	this.setNoOfPages(noOfPages);
	this.setTitle(title);
	this.setYear(year);
	
 }

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getNoOfPages() {
	return noOfPages;
}

public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}


  
}
 
