package problelmstatement.library_system;

// Interface to define reservation-related operations
public interface Reservable {
    boolean reserveItem(String borrower);       // Method to reserve an item
    boolean checkAvailability();               // Method to check item availability
}