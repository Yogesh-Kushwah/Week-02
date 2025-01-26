package problelmstatement.hospital_management_system;



import java.util.ArrayList;
import java.util.List;

// InPatient class extends Patient and implements MedicalRecord
public class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int numberOfDays;
    private List<String> medicalRecords = new ArrayList<>(); // Stores medical records

    // Constructor to initialize inpatient details
    public InPatient(String patientId, String name, int age, double roomChargePerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for InPatient " + getName() + ":");
        for (String record : medicalRecords) {
            System.out.println("- " + record);
        }
    }
}