package problelmstatement.ride_hailing_system;

// Auto class extends Vehicle and implements GPS
public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor to initialize auto details
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Fare calculation for auto
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
