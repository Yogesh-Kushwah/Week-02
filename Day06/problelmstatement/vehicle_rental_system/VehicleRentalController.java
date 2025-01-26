package problelmstatement.vehicle_rental_system;

import java.util.ArrayList;
import java.util.List;

// Main class to test the system
public class VehicleRentalController {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add different types of vehicles to the list
        vehicles.add(new Car("CAR123", 50.0, "CARINS123"));
        vehicles.add(new Bike("BIKE456", 20.0, "BIKEINS456"));
        vehicles.add(new Truck("TRUCK789", 100.0, "TRUCKINS789"));

        // Number of rental days
        int rentalDays = 5;

        // Manage rentals and display costs
        VehicleRentalSystem.manageRentals(vehicles, rentalDays);
    }
}
