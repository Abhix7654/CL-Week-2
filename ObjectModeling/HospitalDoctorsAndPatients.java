// Patient Class: Represents a patient with a name.
class Patient {
    private String name; // Private field to store the name of the patient.

    // Constructor to initialize the name of the patient.
    public Patient(String name) {
        this.name = name;
    }

    // Getter method to retrieve the patient's name.
    public String getName() {
        return name;
    }
}

// Doctor Class: Represents a doctor with a name and the ability to consult patients.
class Doctor {
    private String name; // Private field to store the name of the doctor.

    // Constructor to initialize the name of the doctor.
    public Doctor(String name) {
        this.name = name;
    }

    // Getter method to retrieve the doctor's name.
    public String getName() {
        return name;
    }

    // Consultation method: Simulates the communication between a doctor and a patient.
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }
}

// Hospital Class: Represents a hospital with a name.
class Hospital {
    private String name; // Private field to store the name of the hospital.

    // Constructor to initialize the name of the hospital.
    public Hospital(String name) {
        this.name = name;
    }

    // Getter method to retrieve the hospital's name.
    public String getName() {
        return name;
    }
}

// Main class that demonstrates the working of Doctor and Patient interaction.
public class HospitalApp {
    public static void main(String[] args) {
        // Create instances of Doctor and Patient
        Doctor doctor1 = new Doctor("Dr. Abhi");
        Doctor doctor2 = new Doctor("Dr. Rahul");
        Patient patient1 = new Patient("nitesh");
        Patient patient2 = new Patient("vishal");

        // Doctor 1 consults Patient 1
        doctor1.consult(patient1);
        
        // Doctor 2 consults Patient 2
        doctor2.consult(patient2);
    }
}
