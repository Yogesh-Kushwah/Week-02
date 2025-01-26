package problelmstatement.library_system;



// DVD class extends LibraryItem and implements Reservable
public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true; // Tracks availability status

    // Constructor to initialize DVD details
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // Loan duration for DVDs is 3 days
    }

    @Override
    public boolean reserveItem(String borrower) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved by: " + borrower);
            return true;
        }
        System.out.println("DVD is not available for reservation.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
