package ridehailingapp;

// Subclass for Auto
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm, initialLocation);
    }

    @Override
    public double calculateFare(double distance) {
        // Add a flat booking fee of 20 for Auto
        return (distance * getRatePerKm()) + 20;
    }
}

