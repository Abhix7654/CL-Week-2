package vehiclerentalsystem;

// Car class
class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05; // 5% insurance rate
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber + ", Insurance Rate: 5% (Car)";
    }

    // Interface for insurable vehicles
    static interface Insurable {
        double calculateInsurance();
        String getInsuranceDetails();
    }
}