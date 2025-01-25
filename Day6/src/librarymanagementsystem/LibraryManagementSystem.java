package librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create instances of different library items
        LibraryItem book = new Book("01", "Java", "Abhihsek ");
        LibraryItem magazine = new Magazine("301", "Geographic", "Club Team");
        LibraryItem dvd = new DVD("71", "C++", "Rahul Kumar");

        // Polymorphic list of library items
        LibraryItem[] items = {book, magazine, dvd};

        // Display details and loan durations for all items
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();
        }

        // Reserve items and display updated details
        if (book instanceof Reservable) {
            ((Reservable) book).reserveItem("Naincy");
        }
        if (magazine instanceof Reservable) {
            ((Reservable) magazine).reserveItem("Palak");
        }
        if (dvd instanceof Reservable) {
            ((Reservable) dvd).reserveItem("Raksha");
        }

        System.out.println("\nUpdated Details:");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println();
        }
    }

}
