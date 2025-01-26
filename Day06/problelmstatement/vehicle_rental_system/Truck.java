package problelmstatement.vehicle_rental_system;


// Truck class extends Vehicle and implements Insurable
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor to initialize truck details
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Rental cost is rate per day * days
    }

    @Override
    public double calculateInsurance() {
        return 200.0; // Flat insurance cost for trucks
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }
}