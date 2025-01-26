package problelmstatement.food_delivery_system;


// NonVegItem class extends FoodItem and implements Discountable
public class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;   // Discount in percentage
    private static final double ADDITIONAL_CHARGE = 2.0; // Extra charge per unit

    // Constructor to initialize non-veg item details
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = (getPrice() + ADDITIONAL_CHARGE) * getQuantity();
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
