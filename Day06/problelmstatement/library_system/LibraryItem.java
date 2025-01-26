package problelmstatement.library_system;

// Abstract class to represent a general library item
public abstract class LibraryItem {
    private String itemId;   // Unique identifier for the item
    private String title;    // Title of the item
    private String author;   // Author/Creator of the item

    // Constructor to initialize library item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters for encapsulation
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method to display item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method to get loan duration
    public abstract int getLoanDuration();
}
