package hybridinheritance.restaurantmanagementsystem;



// Subclass Waiter
class Waiter extends Person implements Worker {
    private String shift;

    // Constructor
    public Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    // Implement performDuties() from Worker
    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers during the " + shift + " shift");
    }

    // Display additional Waiter-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shift: " + shift);
    }
}
