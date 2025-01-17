// Class to represent an Item
class Item {

    int itemCode;   // Unique code for the item
    String itemName; // Name of the item
    int price;       // Price of the item

    // Constructor to initialize the item
    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;   // Assign item code
        this.itemName = itemName;   // Assign item name
        this.price = price;         // Assign price
    }

    // Method to calculate the total cost for a given quantity
    public int totalCost(int quantity) {
        return quantity * price; // Multiply quantity with price to get total cost
    }

    // Method to display item details along with the total cost for a fixed quantity
    public void display() {
        System.out.println("ItemCode: " + itemCode + ", ItemName: " + itemName + ", Total price of the Item: " + totalCost(5));
    }
}

// Main class to test the Item class
public class TrackItems {

    public static void main(String[] args) {

        // Create an Item object with sample data
        Item item = new Item(1, "Burger", 10);

        // Display the details of the item
        item.display();
    }
}
