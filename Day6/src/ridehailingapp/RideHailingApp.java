package ridehailingapp;

public class RideHailingApp {
    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle car = new Car("C1", "Sanjay", 15.0, "Piplani");
        Vehicle bike = new Bike("B1", "Sumit ", 10.0, "Mp nagar");
        Vehicle auto = new Auto("A1", "Vikash", 8.0, "Anandnagar");

        // Update locations
        car.updateLocation("City Center");
        bike.updateLocation(" Park");
        auto.updateLocation("Central Mall");

        // Polymorphic processing of vehicles
        Vehicle[] vehicles = {car, bike, auto};
        double distance = 12.5;

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Calculated Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }
}
