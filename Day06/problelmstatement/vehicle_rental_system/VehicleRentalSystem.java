package problelmstatement.vehicle_rental_system;

import java.util.List;

// Utility class to manage vehicle rentals
public class VehicleRentalSystem {
    // Method to calculate and display rental and insurance costs for all vehicles
    public static void manageRentals(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());

            // Calculate rental cost
            double rentalCost = vehicle.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: $" + rentalCost);

            // Check if vehicle is insurable
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: $" + insuranceCost);
                System.out.println(insurableVehicle.getInsuranceDetails());
            }

            System.out.println("----------------------------------");
        }
    }
}
