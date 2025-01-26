package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class ControlClass {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Dijo",40,"Maths");
        teacher.displayRole();

        Student student = new Student("Adarsh", 21, 'A');
        student.displayRole();

        Staff staff = new Staff("Malti", 30, "clerk");
        staff.displayRole();
    }
}
