import java.util.ArrayList; // Import ArrayList to store a list of books

// Class representing a Book
class Book {
    private String title;  // Title of the book
    private String author; // Author of the book

    // Constructor to initialize a Book object with a title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for the title of the book
    public String getTitle() {
        return title;
    }

    // Getter for the author of the book
    public String getAuthor() {
        return author;
    }

    // Override the toString method to provide a custom string representation of the Book object
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + "]";
    }
}

// Class representing a Library
class Library {
    private String name; // Name of the library
    private ArrayList<Book> books; // List of books in the library

    // Constructor to initialize the library with a name and an empty book list
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library's collection
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book); // Calls the toString method of the Book class
        }
    }
}

// Main class to demonstrate the Library and Book functionality
public class LibraryExample {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("Abhi", "rahul");
        Book book2 = new Book("1984", " muskan");

        // Create a library object
        Library library = new Library("City Library");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Display all books in the library
        library.showBooks();

        // Demonstrate that books can exist independently of the library
        System.out.println("Independent Book: " + book1);
    }
}
