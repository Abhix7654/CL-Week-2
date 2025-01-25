package librarymanagementsystem;

// Interface for reservable items
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}
