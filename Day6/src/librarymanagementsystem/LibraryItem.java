package librarymanagementsystem;

// Abstract class for library items
abstract class LibraryItem {
    private final String itemId;
    private final String title;
    private final String author;
    private boolean isReserved;
    private String borrower;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = null;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrower() {
        return borrower;
    }

    // Methods
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Reserved: " + (isReserved ? "Yes" : "No"));
        if (isReserved) {
            System.out.println("Borrower: " + borrower);
        }
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
        this.isReserved = borrower != null;
    }

    // Abstract method
    public abstract int getLoanDuration(); // Loan duration in days
}