class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
      
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "abhis", 20, "Flu");
        Patient patient2 = new Patient("P002", "nitesh", 35, "Migraine");


if(patient1 instanceof Patient){
        patient1.displayDetails();
}
if(patient2 instanceof Patient){
        patient2.displayDetails();
}

        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }


}
