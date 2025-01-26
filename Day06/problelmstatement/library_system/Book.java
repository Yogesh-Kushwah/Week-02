package problelmstatement.library_system;


// Book class extends LibraryItem and implements Reservable
public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true; // Tracks availability status

    // Constructor to initialize book details
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books is 14 days
    }

    @Override
    public boolean reserveItem(String borrower) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved by: " + borrower);
            return true;
        }
        System.out.println("Book is not available for reservation.");
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
