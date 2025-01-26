package hybridinheritance.restaurantmanagementsystem;



// Subclass Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement performDuties() from Worker
    @Override
    public void performDuties() {
        System.out.println("Duties: Preparing meals, specializing in " + specialty);
    }

    // Display additional Chef-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialty: " + specialty);
    }
}
