package HybridInheritance.vehiclesystem;

// Base Class: Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}