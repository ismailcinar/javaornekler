package inher;

import java.util.ArrayList;

public class demo {       

	public static void main(String[] args) {
		
			Book book1= new Book("kitap2",13,"iso",14,"afa","aaa");	
			Book book2= new Book("kitap2",13,"iso",14,"senfafa","aaa");	
			Book book3= new Book("kitap3",12,"iso",12,"senssfa","aaa");	
			journal journal=new journal("günlük","kazým","karabekir",156,"ali",15);
			journal journal2=new journal("günlük2","karabekir","kazým",156,"hebele",15);
			
			ArrayList <publication> books = new ArrayList <publication>();  
			books.add (book1);
	        books.add (book2); 
	        books.add (book3); 
	       
	        library library = new library (books); 
	     
	        ArrayList<publication> abc = library.getPublicationList(); 
	        for (publication vv : abc)
	{   
	      System.out.println("Author : " + vv.getAuthor() +	" Noof:"+	vv.getNoOfPages()+"	title : " + vv.getTitle()+" 	Year : "+vv.getYear()+" ISBN : " + ((Book)vv).getISBN() +	"	 publisher: "+((Book)vv).getPublisher()); 
	        } 
	        
	        ArrayList <publication> journals = new ArrayList <publication>( );  
			journals.add (journal);
	        journals.add (journal2); 
	        
	        library library2 = new library (journals);
	        
	        ArrayList<publication> aaa = library2.getPublicationList(); 
	        for (publication vv : aaa)
	{  
	      System.out.println("Author : " + vv.getAuthor() +	"Noof: "+ vv.getNoOfPages()+ "title : " + vv.getTitle()+"  Year : "+vv.getYear()+ " JournalTitle =" + ((journal)vv).getJournalTitle() + ",   dOI =" + ((journal)vv).getdOI()); 
	        } 
	}
	}
	
	

