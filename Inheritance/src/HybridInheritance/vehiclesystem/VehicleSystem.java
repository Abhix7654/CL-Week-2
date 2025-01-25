package HybridInheritance.vehiclesystem;

public class VehicleSystem {
    public static void main(String[] args) {

        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and perform specific actions
        ev.displayDetails();
        ev.charge();

        System.out.println();

        pv.displayDetails();
        pv.refuel();
    }
}
