package lab4;

import java.text.NumberFormat;
import java.util.Locale;

public class Book {
	 private String title;
	    private String author;
	    private int year;
	    private double cost;
	    private String genre;
		NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("en","US"));

	    public Book(String title,String author,int year,double cost, String genre) {
	        this.setTitle(title);
	        this.setAuthor(author);
	        this.setYear(year);
	        this.setCost(cost);
	        this.setGenre(genre);
	    }

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

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}
		 @Override
		    public String toString() {
		        return fmt.format(getCost()) + "\t" + year + "\t" + title + "\t" + author + "\t" + genre;
		    }
}
