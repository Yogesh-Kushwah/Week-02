package problelmstatement.ecommerceplatform;

public class ControlClass {
    public static void main(String[] args) {

        // Create a clothing product and display details
        Clothing clothing = new Clothing(1, "SweatShirt", 500);
        clothing.display();

        // Update price and display it
        clothing.setPrice(1000);
        int price = clothing.getPrice();
        System.out.println(price);

        // Display updated clothing details
        clothing.display();

        // Create and display groceries product details
        Groceries groceries = new Groceries(1, "Sugar", 1000);
        groceries.display();

        // Create and display electronics product details
        Electronics electronics = new Electronics(1, "Fan", 1500);
        electronics.display();
    }
}
