package multilevelinheritance.educationalcoursehierarchy;

public class Course {

    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void display(){
        System.out.println("The different Courses are: "+
                "CourseName : "+ courseName+
                " Duration "+duration);
    }
}
