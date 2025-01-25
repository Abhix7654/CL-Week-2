package ridehailingapp;


// Subclass for Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm, initialLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}