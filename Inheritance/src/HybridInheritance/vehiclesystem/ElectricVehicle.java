package HybridInheritance.vehiclesystem;

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging. Battery Capacity: " + batteryCapacity + " kWh");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Electric Vehicle, Battery Capacity: " + batteryCapacity + " kWh");
    }
}