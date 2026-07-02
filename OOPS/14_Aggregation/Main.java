// Aggregation --> Aggregation is a type of relationship in OOP where one class contains a 
//                 reference to another class, but both objects can exist independently.

    // It represents a "has-a" relationship.

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Life", 100) ;
        Book book2 = new Book("Unstoppable", 213) ;
        Book book3 = new Book("IKIGAI", 94) ;

        Book[] books = {book1, book2, book3} ;

        Library library = new Library("Golden Library", 1957, books) ;

        library.displayInfo() ; 
    }
}