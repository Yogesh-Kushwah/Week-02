package assistedproblems.vehicleandtransportsystem;

public class Car extends Vehicle{

    int seatCapacity;
    Car(int maxSpeed, String fuelType,int seatCapacity){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
        this.seatCapacity=seatCapacity;

    }

    void displayInfo(){

        System.out.println("Car Details :"+"maxSpeed "+maxSpeed+" fuelType "+fuelType+" SeatCapacity " +seatCapacity);
    }
}
