package multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourses extends Course{

    String platform;
    boolean isRecorded;

    public OnlineCourses(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void show(){
        super.display();
        System.out.println("Platform "+platform+" isRecordeLecture "+isRecorded);
    }
}
