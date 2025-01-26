package assistedproblems.emoployeemanagementsystem;

// Intern class extending Employee
class Intern extends Employee {

    Intern(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Overridden method to display Intern details
    @Override
    void displayDetails() {
        System.out.println("Intern " + " Name : " + name + " id : " + id + " Salary " + salary);
    }
}
