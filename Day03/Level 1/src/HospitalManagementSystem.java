class Patient {
    // Static variable shared by all patients
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;

    // Final variable to uniquely identify each patient
    private final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patients when a new patient is created
    }

    // Static method to get the total number of patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    // Static method to check if an object is an instance of the Patient class
    public static void checkInstance(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("The object is an instance of the Patient class.");
        } else {
            System.out.println("The object is NOT an instance of the Patient class.");
        }
    }
}

// Main class to test the Patient class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient(101, "Alice Brown", 25, "Flu");
        Patient patient2 = new Patient(102, "Bob Smith", 40, "Fracture");

        // Display patient details
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
        System.out.println();

        // Display total number of patients admitted
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        System.out.println();

        // Check if objects are instances of the Patient class
        Patient.checkInstance(patient1); // True
        Patient.checkInstance("Random String"); // False
    }
}
