package problelmstatement.ride_hailing_system;

import java.util.List;

// Utility class to manage ride-hailing operations
public class RideHailingSystem {
    // Method to calculate fares for different vehicles
    public static void processRides(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));

            // Check if GPS functionality is available
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("----------------------------------");
        }
    }
}