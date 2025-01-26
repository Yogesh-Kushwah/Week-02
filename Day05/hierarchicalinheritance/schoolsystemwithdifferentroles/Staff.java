package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Staff extends Person {

    String jobTitle;


    public Staff(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    void displayRole(){
        super.displayRole();
        System.out.println(" jobTitle "+jobTitle
        );
    }
}
