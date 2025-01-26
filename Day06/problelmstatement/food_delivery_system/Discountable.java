package problelmstatement.food_delivery_system;



// Interface to define discount-related operations
public interface Discountable {
    void applyDiscount(double percentage);         // Method to apply a discount
    String getDiscountDetails();                  // Method to get discount details
}
