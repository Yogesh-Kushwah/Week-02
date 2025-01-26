package problelmstatement.food_delivery_system;

// VegItem class extends FoodItem and implements Discountable
public class VegItem extends FoodItem implements Discountable {
    private double discount = 0; // Discount in percentage

    // Constructor to initialize veg item details
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = getPrice() * getQuantity();
        return totalPrice - (totalPrice * (discount / 100)); // Apply discount if any
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            discount = percentage;
            System.out.println("Discount applied: " + percentage + "%");
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "%";
    }
}
