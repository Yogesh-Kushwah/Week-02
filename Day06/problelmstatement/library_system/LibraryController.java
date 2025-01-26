package problelmstatement.library_system;

import java.util.ArrayList;
import java.util.List;

// Main class to test the library management system
public class LibraryController {
    public static void main(String[] args) {
        // Create a list of library items
        List<LibraryItem> items = new ArrayList<>();

        // Add books, magazines, and DVDs to the list
        items.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Magazine("M001", "Time Magazine", "Time Editorial"));
        items.add(new DVD("D001", "Inception", "Christopher Nolan"));

        // Process library items
        LibraryManagementSystem.processLibraryItems(items);
    }
}
