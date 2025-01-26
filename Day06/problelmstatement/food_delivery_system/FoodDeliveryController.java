package problelmstatement.food_delivery_system;

import java.util.ArrayList;
import java.util.List;

// Main class to test the online food delivery system
public class FoodDeliveryController {
    public static void main(String[] args) {
        // Create a list of food items for the order
        List<FoodItem> foodItems = new ArrayList<>();

        // Add veg and non-veg items to the list
        VegItem vegItem = new VegItem("Paneer Butter Masala", 8.0, 2);
        vegItem.applyDiscount(10); // Apply a discount to the veg item
        foodItems.add(vegItem);

        NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 12.0, 1);
        nonVegItem.applyDiscount(5); // Apply a discount to the non-veg item
        foodItems.add(nonVegItem);

        // Process the order
        FoodDeliverySystem.processOrder(foodItems);
    }
}