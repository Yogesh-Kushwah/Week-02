package hybridinheritance.restaurantmanagementsystem;


public class ControlClass {
    public static void main(String[] args) {
        // Creating instances of Chef and Waiter
        Worker chef = new Chef("Alice", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Bob", 102, "Evening");


        // Storing workers in an array
        Worker[] workers = { chef, waiter };


        // Displaying worker details and their duties
        for (Worker worker : workers) {
            System.out.println("Worker Details:");
            if (worker instanceof Person) {
                ((Person) worker).displayInfo(); // Casting Worker to Person to access displayInfo()
            }

            worker.performDuties();
            System.out.println("-----------------------------------------------");
        }
    }
}
