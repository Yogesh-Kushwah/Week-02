package hybridinheritance.vehiclemanagementsystem;


public class ControlClass {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 260, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and perform actions for ElectricVehicle
        System.out.println("Electric Vehicle Details:");
        ev.displayInfo();
        ev.charge();

        System.out.println("------------------------------------");

        // Display details and perform actions for PetrolVehicle
        System.out.println("Petrol Vehicle Details:");
        pv.displayInfo();
        pv.refuel();
    }
}
