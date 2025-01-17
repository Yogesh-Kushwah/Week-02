class Employee{

    String name;
    int id;
  double salary;

    Employee(int id, String name , double salary){

        this.name=name ;
        this.id=id;
        this.salary=salary;
    }

    public  void display(){
        System.out.println("Employee Id"+  id +" Name "+ name +" Salary "+ salary);

    }
}



public class EmployeesDetails {

    public static void main(String[] args) {
        Employee emp= new Employee(1, "Adarsh", 1500.0);

        emp.display();


    }
}
