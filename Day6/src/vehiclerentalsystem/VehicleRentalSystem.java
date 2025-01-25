package vehiclerentalsystem;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle car = new Car("BR2282", 1000, "CAR-INS-1234");
        Vehicle bike = new Bike("B202", 300, "BIKE-INS-5678");
        Vehicle truck = new Truck("MP279", 2000, "TRUCK-INS-9101");

        // Polymorphic list of vehicles
        Vehicle[] vehicles = {car, bike, truck};

        // Calculate and display rental and insurance costs for each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            int rentalDays = 5; // Example rental period
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = (vehicle instanceof Car.Insurable) ? ((Car.Insurable) vehicle).calculateInsurance() : 0;

            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            if (vehicle instanceof Car.Insurable) {
                System.out.println("Insurance Cost: " + insuranceCost);
                System.out.println(((Car.Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
