package problelmstatement.hospital_management_system;


import java.util.ArrayList;
import java.util.List;

// OutPatient class extends Patient and implements MedicalRecord
public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords = new ArrayList<>(); // Stores medical records

    // Constructor to initialize outpatient details
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for OutPatient " + getName() + ":");
        for (String record : medicalRecords) {
            System.out.println("- " + record);
        }
    }
}