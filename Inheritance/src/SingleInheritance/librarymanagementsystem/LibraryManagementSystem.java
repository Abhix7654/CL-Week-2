package SingleInheritance.librarymanagementsystem;

public class LibraryManagementSystem {
    // Main method
    public static void main(String[] args) {

        // Create an instance of Author
        Author author = new Author("The Great Abhishek", 2000, "Abhishek",
                "Abhishek is a great boy");

        // Display information about the book and its author
        author.displayInfo();
    }
}
