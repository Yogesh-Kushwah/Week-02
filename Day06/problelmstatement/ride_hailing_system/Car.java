package problelmstatement.ride_hailing_system;

// Car class extends Vehicle and implements GPS
public class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor to initialize car details
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Fare calculation for car
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
