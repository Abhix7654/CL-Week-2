package ridehailingapp;

// Subclass for Car
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm, initialLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}