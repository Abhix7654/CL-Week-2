package IntroductionOfInheritance.vehicletransportsystem;

public class VehicleTransportSystem {
    // Create objects of different subclasses
    public static void main(String[] args) {
    Vehicle car = new Car(200, "Petrol", 5);
    Vehicle truck = new Truck(120, "Diesel", 10);
    Vehicle motorcycle = new Motorcycle(150, "Petrol", true);

    // Store them in an array of Vehicle type
    Vehicle[] vehicles = { car, truck, motorcycle };

    // polymorphism
        for (Vehicle vehicle : vehicles) {
        vehicle.displayInfo();
    }
}
}
