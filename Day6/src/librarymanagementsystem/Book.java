package librarymanagementsystem;

// Book class
class Book extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 14; // 14 days

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved for: " + borrowerName);
            return true;
        }
        System.out.println("Book is already reserved.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}