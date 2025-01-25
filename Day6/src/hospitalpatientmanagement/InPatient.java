package hospitalpatientmanagement;

// Subclass for in-patients
class InPatient extends Patient implements MedicalRecord {
    private final int daysAdmitted;
    private final double dailyRate;
    private String records;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.records = "";
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
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
