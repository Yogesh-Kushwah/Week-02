package problelmstatement.vehicle_rental_system;

// Bike class extends Vehicle and implements Insurable
public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor to initialize bike details
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Rental cost is rate per day * days
    }

    @Override
    public double calculateInsurance() {
        return 50.0; // Flat insurance cost for bikes
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }
}