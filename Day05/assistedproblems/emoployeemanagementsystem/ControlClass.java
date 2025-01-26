package assistedproblems.emoployeemanagementsystem;

public class ControlClass {

    public static void main(String[] args) {
        // Creating and displaying an Employee object
        Employee emp = new Employee();
        emp.displayDetails();

        // Creating and displaying a Manager object
        emp = new Manager("Adarsh", 1, 2500, 5);
        emp.displayDetails();

        // Creating and displaying a Developer object
        emp = new Developer("Abhinesh", 1, 50000, "java");
        emp.displayDetails();

        // Creating and displaying an Intern object
        emp = new Intern("Satyam", 1, 25000);
        emp.displayDetails();
    }
}
