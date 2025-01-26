package problelmstatement.ecommerceplatform;

public class Clothing extends Product implements Taxable {

    int price = getPrice();
    double tax;
    double discount;

    public Clothing(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    void calculateDiscout() {
        // Calculate discount based on price
        if (price > 1000) {
            discount = price * 0.2;
        } else {
            discount = price * 0.1;
        }
    }

    @Override
    public void calculateTax() {
        // Calculate tax based on price
        if (price > 500) {
            tax = price * 0.05;
        } else {
            tax = price * 0.02;
        }
    }

    @Override
    public void getTaxDetails() {
        // Display the tax details
        System.out.println("The tax on the " + price + " is " + tax);
    }

    public void discountDetails() {
        // Display the discount details
        System.out.println("The Discount on the " + price + " is " + discount);
    }

    public void display() {
        System.out.println("The Original Price Of the Product: " + this.price);

        calculateTax();
        getTaxDetails();
        calculateDiscout();
        discountDetails();

        // Calculate final price after discount and tax
        double price = (this.price + this.tax) - discount;

        System.out.println("The Final Cost of the Product after Discount and Tax: " + price);
    }
}
