class Employee{

    static String companyName;
    String name;
    final int id;
    String designation;

    static int totalEmployees;

    public Employee(String name, int id, String designation,String companyName) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        Employee.companyName=companyName;

        totalEmployees++;
    }



    static void displayTotalEmployees(){


        System.out.println("The total No of Employees are : "+ totalEmployees);
    }

    void display(){

        System.out.println(" companyName "+companyName+" Name "+name+" Id "+id+" Designation "+designation);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp=new Employee("Dipanshu",1,"Senior Manager","SAP");

        if(emp instanceof Employee){
            emp.display();
        }

        Employee emp1=new Employee("Adarsh",2,"Senior Manager","Google");

        if(emp1 instanceof Employee){
            emp1.display();
        }
        Employee.displayTotalEmployees();
    }

}
