package problelmstatement.vehicle_rental_system;


// Car class extends Vehicle and implements Insurable
public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor to initialize car details
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Rental cost is rate per day * days
    }

    @Override
    public double calculateInsurance() {
        return 100.0; // Flat insurance cost for cars
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }
}
