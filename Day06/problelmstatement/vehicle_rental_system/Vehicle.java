package problelmstatement.vehicle_rental_system;

// Abstract class to represent a general vehicle
public abstract class Vehicle {
    private String vehicleNumber; // Unique vehicle identifier
    private String type;          // Type of vehicle (e.g., Car, Bike, Truck)
    private double rentalRate;    // Rental rate per day

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters for encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);
}