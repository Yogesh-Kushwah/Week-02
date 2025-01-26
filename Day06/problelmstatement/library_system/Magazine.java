package problelmstatement.library_system;

// Magazine class extends LibraryItem and implements Reservable
public class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true; // Tracks availability status

    // Constructor to initialize magazine details
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for magazines is 7 days
    }

    @Override
    public boolean reserveItem(String borrower) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved by: " + borrower);
            return true;
        }
        System.out.println("Magazine is not available for reservation.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
