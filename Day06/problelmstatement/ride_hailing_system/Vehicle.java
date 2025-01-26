package problelmstatement.ride_hailing_system;

// Abstract class representing a general vehicle
public abstract class Vehicle {
    private String vehicleId;    // Unique vehicle ID
    private String driverName;   // Driver's name
    private double ratePerKm;    // Rate per kilometer

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method to calculate the fare
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: $" + ratePerKm;
    }
}
