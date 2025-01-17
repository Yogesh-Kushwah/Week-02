// Class to represent a Mobile Phone
class MobilePhone {

    String brand; // Brand of the mobile phone
    String model; // Model of the mobile phone
    int price;    // Price of the mobile phone

    // Constructor to initialize the mobile phone details
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;   // Assign brand
        this.model = model;   // Assign model
        this.price = price;   // Assign price
    }

    // Method to display the details of the mobile phone
    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

// Main class to test the MobilePhone class
public class MobilePhoneDetails {

    public static void main(String[] args) {

        // Create the first MobilePhone object with sample data and display its details
        MobilePhone mobilePhone = new MobilePhone("Mi", "xf21", 200);
        mobilePhone.display();

        // Create the second MobilePhone object with sample data and display its details
        MobilePhone mobilePhone2 = new MobilePhone("iPhone", "xz43", 3000);
        mobilePhone2.display();

        // Create the third MobilePhone object with sample data and display its details
        MobilePhone mobilePhone3 = new MobilePhone("Vivo", "SF 33", 250);
        mobilePhone3.display();
    }
}
