package problelmstatement.employeemanagementsystem;

public class ControlClass {
    public static void main(String[] args) {

        // Create a full-time employee and display details
        Employee employee1 = new FullTimeEmployee(1, "yogesh", 3000, 10, "Developer");
        employee1.displayDetails();

        // Create a part-time employee and display details
        Employee employee2 = new PartTimeEmployee(1, "Adarsh", 2000, 10, "Marketing");
        employee2.displayDetails();
    }
}
