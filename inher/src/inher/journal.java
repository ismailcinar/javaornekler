package inher;

public class journal extends publication{
	private String dOI;
	private String journalTitle;
	
	journal(){
		
	}

	public journal(String dOI, String journalTitle,String author, int noOfPages, String title, int year) {
		super(author, noOfPages, title, year);
		this.dOI = dOI;
		this.journalTitle=journalTitle;
	}

	public journal(String dOI, String journalTitle) {
		
		this.dOI = dOI;
		this.journalTitle=journalTitle;
	}

	public String getJournalTitle() {
		return journalTitle;
	}

	public void setJournalTitle(String journalTitle) {
		this.journalTitle = journalTitle;
	}

	public String getdOI() {
		return dOI;
	}

	public void setdOI(String dOI) {
		this.dOI = dOI;
	}

	@Override
	public String toString() {
		return "journal [getJournalTitle()=" + getJournalTitle() + ", getdOI()=" + getdOI() + ", getAuthor()="
				+ getAuthor() + ", getNoOfPages()=" + getNoOfPages() + ", getTitle()=" + getTitle() + ", getYear()="
				+ getYear() + "]";
	}

	

	


	
	
	
	
}
