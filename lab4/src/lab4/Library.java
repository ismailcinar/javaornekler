package lab4;


public class Library {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		BookCollection collection = new BookCollection();
        Book book1 = new Book("The Grapes of Wrath","	John Steinbeck",1939,24.95,"Fiction");
        collection.addBook(book1);
        Book book2 = new Book("Ulysses","James Joyce",1922,19.95,"Modernist");
        collection.addBook(book2);
        Book book3 = new Book("The Man in the High Castle","Philip K.Dick",1962,15.95,"Alternate history");
        collection.addBook(book3);
        collection.toString();
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		BookCollection collection2 = new BookCollection();
        Book book4 = new Book("The Grapes of Wrath","John Steinbeck",1939,24.95,"Fiction");
        collection2.addBook(book4);
        Book book5 = new Book("Ulysses","James Joyce",1922,19.95,"Modernist");
        collection2.addBook(book5);
        Book book6 = new Book("The Man in the High Castle","Philip K.Dick",1962,15.95,"Alternate history");
        collection2.addBook(book6);
        Book book7= new Book("The Ambassadors","Henry James",1903,17.50,"Dark comedy");
        collection2.addBook(book7);
        Book book8 = new Book("The Collector","John Fowles",1963,19.95,"Thriller");
        collection2.addBook(book8);
        collection2.toString();
	}

}
