package problelmstatement.ecommerceplatform;

public abstract class Product {
    private int productId;
    private String name;
    private int price;

    // Constructor to initialize product details
    public Product(int productId, String name, int price) {
        setName(name);
        setPrice(price);
        setProductId(productId);
    }

    // Abstract method to calculate discount (to be implemented by subclasses)
    abstract void calculateDiscout();

    // Setters and getters for product properties
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
