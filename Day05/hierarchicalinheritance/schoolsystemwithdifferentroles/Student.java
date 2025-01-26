package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Student extends Person{

    char grade;

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole(){
        super.displayRole();
        System.out.println(" Grade "+grade
        );
    }
}
