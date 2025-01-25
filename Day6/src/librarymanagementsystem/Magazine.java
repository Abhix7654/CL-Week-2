package librarymanagementsystem;

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 7; // 7 days

    public Magazine(String itemId, String title, String author) {
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
            System.out.println("Magazine reserved for: " + borrowerName);
            return true;
        }
        System.out.println("Magazine is already reserved.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}