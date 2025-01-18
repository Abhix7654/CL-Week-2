// Base class
public class Book {
    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access modifiers
class EBook extends Book {
    private double fileSize; // Size of the eBook in MB

    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        // Accessing public and protected members from the base class
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Public access
        System.out.println("Title: " + title); // Protected access
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class to test the implementation
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book.displayBookDetails();

        // Accessing and modifying the author name using public methods
        System.out.println("\nUpdating Author...");
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());

        // Creating an EBook object
        EBook eBook = new EBook("978-0-12-345678-9", "Advanced Java", "Alice Brown", 5.0);
        System.out.println("\nE-Book Details:");
        eBook.displayEBookDetails();
    }
}
