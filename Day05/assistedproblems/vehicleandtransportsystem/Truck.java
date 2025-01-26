package assistedproblems.vehicleandtransportsystem;

public class Truck extends Vehicle{

    int seatCapacity;
    Truck(int maxSpeed, String fuelType,int seatCapacity){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
        this.seatCapacity=seatCapacity;

    }

    void displayInfo(){

        System.out.println("Truck Details :"+"maxSpeed "+maxSpeed+" fuelType "+fuelType+" SeatCapacity " +seatCapacity);
    }
}
