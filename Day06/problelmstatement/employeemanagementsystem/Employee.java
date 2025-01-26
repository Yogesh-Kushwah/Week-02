package problelmstatement.employeemanagementsystem;

// Abstract class representing an employee
public abstract class Employee {

    // Private fields to store employee details
    private int employeeId;
    private String name;
    private int baseSalary;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, int baseSalary) {
        setEmployeeId(employeeId);
        setName(name);
        setBaseSalary(baseSalary);
    }

    // Abstract method to calculate salary (to be implemented by subclasses)
    public abstract void calculateSalary();

    // Method to display employee details
    void displayDetails() {
        System.out.print("EmployeeId: " + employeeId + " Name: " + name + " Salary " + baseSalary + " ");
    }

    // Getter for employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employee ID
    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Setter for employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for base salary
    public int getBaseSalary() {
        return baseSalary;
    }

    // Setter for base salary
    public void setBaseSalary(int salary) {
        baseSalary = salary;
    }
}
