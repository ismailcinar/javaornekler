package lab4;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;



public class BookCollection {
	 private ArrayList<Book> collection = new ArrayList<Book>();
	    private int count;
	    private double totalCost;

public BookCollection() {
    this.count=0 ;
    this.totalCost=0;
}
public void addBook(Book book) {
    collection.add(book);
    totalCost += book.getCost();
    count++;
}
NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("en","US"));

public String toString() {
    System.out.println("My Book Collection\n" + "\nNumber of Books : " + collection.size() + "\nTotal cost : " + fmt.format(getTotalCost()) + "\nAverage cost : " + fmt.format((getTotalCost()/count)));
    System.out.println("\nBook List :\n"); 
    for(Book book : collection) {
        System.out.println(book.toString());
    }
    return "";
}

public ArrayList<Book> getCollection() {
    return collection;
}
public void setCollection(ArrayList<Book> collection) {
    this.collection = collection;
}
public int getCount() {
    return count;
}
public void setCount(int count) {
    this.count = count;
}
public double getTotalCost() {
    return totalCost;
}
public void setTotalCost(double totalCost) {
    this.totalCost = totalCost;
}
}