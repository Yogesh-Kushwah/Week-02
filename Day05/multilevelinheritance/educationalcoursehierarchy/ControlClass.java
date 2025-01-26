package multilevelinheritance.educationalcoursehierarchy;

public class ControlClass {
    public static void main(String[] args) {

        PaidOnlineCourses courses=new PaidOnlineCourses("JavaFullStack",2,"Coursera",true,5000,20);

        courses.print();
    }
}
