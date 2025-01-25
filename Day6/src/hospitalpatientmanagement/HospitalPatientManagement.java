package hospitalpatientmanagement;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Create instances of patients
        Patient inPatient = new InPatient("P001", "Abhi ", 45, 5, 2000.0);
        Patient outPatient = new OutPatient("P002", "Rahul", 30, 500.0);

        // Set medical details
        inPatient.setDiagnosis("Pneumonia");
        inPatient.setMedicalHistory("No prior conditions");
        outPatient.setDiagnosis("Common Cold");
        outPatient.setMedicalHistory("Allergic");

        // Add medical records
        if (inPatient instanceof MedicalRecord) {
            ((MedicalRecord) inPatient).addRecord("Admitted to general ward.");
            ((MedicalRecord) inPatient).addRecord(" antibiotics.");
        }
        if (outPatient instanceof MedicalRecord) {
            ((MedicalRecord) outPatient).addRecord("Consulted Dr. Muskan.");
        }

        // Polymorphic processing of patients
        Patient[] patients = {inPatient, outPatient};
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                System.out.println("Medical Records: " + ((MedicalRecord) patient).viewRecords());
            }
            System.out.println();
        }
    }
}
