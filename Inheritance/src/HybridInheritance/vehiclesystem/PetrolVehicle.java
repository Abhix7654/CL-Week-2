package HybridInheritance.vehiclesystem;

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Petrol Vehicle, Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}
