package inher;

import java.util.ArrayList;




public class library {
	private  ArrayList <publication> publicationList;
	
	public library(ArrayList<publication> publicationList) {
		this.publicationList=publicationList;
	}
		
	public ArrayList<publication> getPublicationList() {
		return publicationList;
	}

	public void setPublicationList(ArrayList<publication> publicationList) {
		this.publicationList = publicationList;
	}
	

	
	@Override
	public String toString() {
		return "library"+publicationList;
	}
	
	
	

	
}
