package problelmstatement.food_delivery_system;



// Abstract class to represent a general food item
public abstract class FoodItem {
    private String itemName;  // Name of the food item
    private double price;     // Price per unit
    private int quantity;     // Quantity ordered

    // Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Abstract method to calculate the total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity;
    }
}
