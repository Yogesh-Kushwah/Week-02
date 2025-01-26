package assistedproblems.emoployeemanagementsystem;

// Developer class extending Employee
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden method to display Developer details
    @Override
    void displayDetails() {
        System.out.println("programmingLanguage = " + programmingLanguage + " Name : " + name + " id : " + id + " Salary " + salary);
    }
}
