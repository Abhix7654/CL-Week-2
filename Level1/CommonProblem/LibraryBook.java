public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Default availability
    }

    // Method to borrow a book
    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Effective Java", "Joshua Bloch", 799.99);
        book.displayBookDetails();

        if (book.borrow()) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available!");
        }

        book.displayBookDetails();
    }
}
