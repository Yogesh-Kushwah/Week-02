package problelmstatement.hospital_management_system;


import java.util.ArrayList;
import java.util.List;

// Main class to test the hospital management system
public class HospitalController {
    public static void main(String[] args) {
        // Create a list of patients
        List<Patient> patients = new ArrayList<>();

        // Add InPatient and OutPatient to the list
        InPatient inPatient = new InPatient("P001", "Alice", 30, 200.0, 5);
        inPatient.addRecord("Admitted for appendicitis.");
        inPatient.addRecord("Underwent successful surgery.");
        patients.add(inPatient);

        OutPatient outPatient = new OutPatient("P002", "Bob", 25, 50.0);
        outPatient.addRecord("Consulted for flu symptoms.");
        patients.add(outPatient);

        // Process patients
        HospitalManagementSystem.processPatients(patients);
    }
}
