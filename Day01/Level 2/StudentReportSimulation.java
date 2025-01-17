// Class to represent a Student
class Student {

    String name;      // Name of the student
    int rollnumber;   // Roll number of the student
    int marks;        // Marks obtained by the student

    // Constructor to initialize the student's details
    public Student(String name, int rollnumber, int marks) {
        this.name = name;       // Assign name
        this.rollnumber = rollnumber;   // Assign roll number
        this.marks = marks;     // Assign marks
    }

    // Method to calculate the grade based on marks
    public char gradeCalci(int marks) {
        int op = marks / 10;    // Divide marks by 10 to determine the grade range

        // Return grade based on the result of division
        return switch (op) {
            case 9 -> 'A';      // If marks are between 90-99
            case 8 -> 'B';      // If marks are between 80-89
            case 7 -> 'C';      // If marks are between 70-79
            case 6 -> 'D';      // If marks are between 60-69
            default -> 'F';     // If marks are below 60
        };
    }

    // Method to display the student details including the grade
    public void display() {
        System.out.println("Name: " + name + ", RollNo: " + rollnumber + ", Grade: " + gradeCalci(this.marks));
    }
}

// Main class to simulate the student report generation
public class StudentReportSimulation {

    public static void main(String[] args) {

        // Create a Student object with sample data
        Student st = new Student("Adarsh", 199, 44);

        // Display the details of the student
        st.display();
    }
}
