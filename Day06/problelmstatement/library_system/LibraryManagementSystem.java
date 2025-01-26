package problelmstatement.library_system;

import java.util.List;

// Utility class to manage library items
public class LibraryManagementSystem {
    // Method to display item details and loan durations
    public static void processLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check availability and reserve item if possible
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                reservableItem.reserveItem("John Doe"); // Example borrower
            }

            System.out.println("----------------------------------");
        }
    }
}
