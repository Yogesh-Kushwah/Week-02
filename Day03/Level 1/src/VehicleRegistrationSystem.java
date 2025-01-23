class Vehicle {
    // Static variable shared by all vehicles
    private static double registrationFee = 1000.0;

    // Final variable to uniquely identify each vehicle
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize ownerName, vehicleType, and registrationNumber
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Static method to check if an object belongs to the Vehicle class
    public static void checkInstance(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("The object is an instance of the Vehicle class.");
        } else {
            System.out.println("The object is NOT an instance of the Vehicle class.");
        }
    }
}

// Main class to test the Vehicle class
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "CAR12345");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "BIKE67890");

        // Display registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(1200.0);

        // Display updated registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        // Check if objects are instances of the Vehicle class
        Vehicle.checkInstance(vehicle1); // True
        Vehicle.checkInstance("Random String"); // False
    }
}
