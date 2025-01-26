package problelmstatement.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {

    int workingHours;
    String assignDepartment;

    // Constructor to initialize part-time employee details
    public PartTimeEmployee(int employeeId, String name, int baseSalary, int workingHours, String Department) {
        super(employeeId, name, baseSalary); // Call parent class constructor
        this.workingHours = workingHours;
        assignDepatment(Department); // Assign department
    }

    @Override
    // Calculate salary based on working hours (300 per hour)
    public void calculateSalary() {
        System.out.print("WorkingHours: " + workingHours + " TotalSalary " + workingHours * 3000 + " ");
    }

    @Override
    // Assign department to the employee
    public void assignDepatment(String assignDepartment) {
        this.assignDepartment = assignDepartment;
    }

    @Override
    // Display the assigned department
    public void getDepartment() {
        System.out.print("The Current Depatment is " + assignDepartment + " ");
    }

    // Display employee details along with salary and department
    void displayDetails() {
        super.displayDetails();
        calculateSalary();
        getDepartment();
    }
}
