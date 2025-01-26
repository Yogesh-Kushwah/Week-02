package problelmstatement.food_delivery_system;


import java.util.List;

// Utility class to manage food items and order processing
public class FoodDeliverySystem {
    // Method to process food items in an order
    public static void processOrder(List<FoodItem> foodItems) {
        double grandTotal = 0;

        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());

            // Calculate total price
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);

            // Check if the item is discountable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }

            System.out.println("----------------------------------");
            grandTotal += totalPrice;
        }

        System.out.println("Grand Total for Order: $" + grandTotal);
    }
}
