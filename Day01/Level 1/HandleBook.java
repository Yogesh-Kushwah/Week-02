// Class to represent a Book
class Book {

    String title;  // Title of the book
    String author; // Author of the book
    int price;     // Price of the book

    // Constructor to initialize Book object
    public Book(String title, String author, int price) {
        this.title = title;   // Assign title
        this.author = author; // Assign author
        this.price = price;   // Assign price
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

// Main class to test the Book class
public class HandleBook {
    public static void main(String[] args) {

        // Create a Book object with sample details
        Book book = new Book("Dipanshu the Legend", "Yogesh", 20);

        // Display the details of the book
        book.display();
    }
}
