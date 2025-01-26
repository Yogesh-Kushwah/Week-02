package problelmstatement.ride_hailing_system;

import java.util.ArrayList;
import java.util.List;

// Main class to test the ride-hailing application
public class RideSystemController {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car, Bike, and Auto to the list
        Car car = new Car("C001", "Alice", 10.0);
        car.updateLocation("Downtown");
        vehicles.add(car);

        Bike bike = new Bike("B001", "Bob", 5.0);
        bike.updateLocation("City Center");
        vehicles.add(bike);

        Auto auto = new Auto("A001", "Charlie", 7.0);
        auto.updateLocation("Station");
        vehicles.add(auto);

        // Process rides with a distance of 15 km
        RideHailingSystem.processRides(vehicles, 15.0);
    }
}