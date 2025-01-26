package hybridinheritance.vehiclemanagementsystem;

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Implement the refuel method from Refuelable
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol Vehicle");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
