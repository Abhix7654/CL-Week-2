class Vehicle {
    private static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("V001", "Abhi", "Car");
        Vehicle vehicle2 = new Vehicle("V002", "Raj", "Motorcycle");

        Vehicle.updateRegistrationFee(750.0);
if(vehicle1 instanceof Vehicle){
        vehicle1.displayDetails();
}
if(vehicle2 instanceof Vehicle){
        vehicle2.displayDetails();
}

  
    }


}
