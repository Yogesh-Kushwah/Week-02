package multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourses extends OnlineCourses{

    int fee;
    int discount;

    public PaidOnlineCourses(String courseName, int duration, String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void print(){
        super.show();
        System.out.println("Fees "+fee+" Discount "+discount);
    }
}
