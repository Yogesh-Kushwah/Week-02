package assistedproblems.vehicleandtransportsystem;

public class ControlClass {
    public static void main(String[] args) {




        Car car= new Car(120,"diesal",5);


       Truck truck= new Truck(150,"diesal",50);


        Motorcycle motorcycle= new Motorcycle(200,"Petrol",3);

        Vehicle[] vehicles= {car,truck,motorcycle};

        for(Vehicle veh:vehicles){

            System.out.println("vehicle Details");
            veh.displayInfo();
        }



    }
}
