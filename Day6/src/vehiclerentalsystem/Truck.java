package vehiclerentalsystem;

// Truck class
class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.1; // 10% insurance rate
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% extra cost for heavy-duty
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber + ", Insurance Rate: 10% (Truck)";
    }
}
