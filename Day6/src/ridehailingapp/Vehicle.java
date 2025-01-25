package ridehailingapp;

// Abstract class for Vehicle
abstract class Vehicle implements GPS {
    private final String vehicleId;
    private final String driverName;
    private final double ratePerKm;
    private String currentLocation;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = initialLocation;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // GPS interface methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}
