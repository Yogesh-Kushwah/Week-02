package problelmstatement.ride_hailing_system;

// Bike class extends Vehicle and implements GPS
public class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor to initialize bike details
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Fare calculation for bike
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation != null ? currentLocation : "Location not set.";
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}