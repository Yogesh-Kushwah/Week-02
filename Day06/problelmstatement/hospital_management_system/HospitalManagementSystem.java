package problelmstatement.hospital_management_system;


import java.util.List;

// Utility class to manage patients
public class HospitalManagementSystem {
    // Method to process patient billing and records
    public static void processPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill: $" + patient.calculateBill());

            // Check if the patient has medical records
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.viewRecords();
            }

            System.out.println("----------------------------------");
        }
    }
}
