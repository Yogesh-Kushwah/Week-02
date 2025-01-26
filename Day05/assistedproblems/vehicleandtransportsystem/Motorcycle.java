package assistedproblems.vehicleandtransportsystem;

public class Motorcycle extends Vehicle{

    int seatCapacity;
    Motorcycle(int maxSpeed, String fuelType,int seatCapacity){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
        this.seatCapacity=seatCapacity;

    }

    void displayInfo(){

        System.out.println("MotorCycle Details :"+"maxSpeed "+maxSpeed+" fuelType "+fuelType+" SeatCapacity " +seatCapacity);
    }
}
