package librarymanagementsystem;

// DVD class
class DVD extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 5; // 5 days

    public DVD(String itemId, String title, String author) {
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
            System.out.println("DVD reserved for: " + borrowerName);
            return true;
        }
        System.out.println("DVD is already reserved.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}

