package hospitalpatientmanagement;


// Subclass for out-patients
class OutPatient extends Patient implements MedicalRecord {
    private final double consultationFee;
    private String records;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records += record + "\n";
    }

    @Override
    public String viewRecords() {
        return records.isEmpty() ? "No records available." : records;
    }
}

