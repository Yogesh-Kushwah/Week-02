package problelmstatement.ecommerceplatform;

public class Groceries extends Product implements Taxable {

    int price = getPrice();
    double tax;
    double discount;

    // Constructor to initialize groceries product details
    public Groceries(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
        // Calculate discount based on price
    void calculateDiscout() {
        if (price > 1000) {
            discount = price * .2;
        } else {
            discount = price * .1;
        }
    }

    @Override
    // Calculate tax based on price
    public void calculateTax() {
        if (price > 500) {
            tax = price * .05;
        } else {
            tax = price * .02;
        }
    }

    @Override
    // Display tax details
    public void getTaxDetails() {
        System.out.println("The tax on the " + price + " is " + tax);
    }

    // Display discount details
    public void discountDetails() {
        System.out.println("The Discount on the " + price + " is " + discount);
    }

    // Display product details including price, tax, and discount
    public void display() {
        System.out.println("The Original Price Of the Product: " + this.price);

        calculateTax();
        getTaxDetails();
        calculateDiscout();
        discountDetails();

        // Calculate final price after tax and discount
        double price = (this.price + this.tax) - discount;
        System.out.println("The Final Cost of the Product after Discount: " + price);
    }
}
