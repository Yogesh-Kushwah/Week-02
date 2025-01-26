package problelmstatement.employeemanagementsystem;

// Full-time employee class extending Employee and implementing Department
public class FullTimeEmployee extends Employee implements Department {

    int workingHours;
    public String assignDepartment;

    // Constructor to initialize full-time employee details
    public FullTimeEmployee(int employeeId, String name, int baseSalary, int workingHours, String Department) {
        super(employeeId, name, baseSalary); // Call parent class constructor
        this.workingHours = workingHours;
        assignDepatment(Department); // Assign department
    }

    @Override
    // Calculate salary based on working hours
    public void calculateSalary() {
        System.out.println("WorkingHours: " + workingHours + " TotalSalary " + workingHours * 5000);
    }

    @Override
    // Assign department to the employee
    public void assignDepatment(String assignDepartment) {
        this.assignDepartment = assignDepartment;
    }

    @Override
    // Display the assigned department
    public void getDepartment() {
        System.out.println("The Current Depatment is " + assignDepartment);
    }

    // Display employee details along with salary and department
    void displayDetails() {
        super.displayDetails();
        calculateSalary();
        getDepartment();
    }
}
