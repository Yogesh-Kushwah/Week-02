package problelmstatement.hospital_management_system;


// Abstract class representing a general patient
public abstract class Patient {
    private String patientId;  // Unique patient ID
    private String name;       // Patient's name
    private int age;           // Patient's age

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters for encapsulation
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();
}
