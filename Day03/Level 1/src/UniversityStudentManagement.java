class Student {
    // Static variable shared across all students
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    // Final variable for roll number (cannot be changed once initialized)
    private final int rollNumber;

    // Instance variables
    private String name;
    private String grade;

    // Constructor to initialize name, rollNumber, and grade using 'this'
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students when a new student is created
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated successfully for Roll Number: " + rollNumber);
    }

    // Method to check if an object is an instance of the Student class
    public static void checkInstance(Object obj) {
        if (obj instanceof Student) {
            System.out.println("The object is an instance of the Student class.");
        } else {
            System.out.println("The object is NOT an instance of the Student class.");
        }
    }
}
// Main class to test the Student class
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        // Display details of each student
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Update grade for student2
        student2.updateGrade("A+");

        // Display updated details
        student2.displayStudentDetails();

        // Check if objects are instances of Student
        Student.checkInstance(student1); // True
        Student.checkInstance("Random String"); // False

        // Display the total number of students
        Student.displayTotalStudents();
    }
}