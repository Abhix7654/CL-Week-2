package vehiclerentalsystem;

//Abstract class for Vehicle
abstract class Vehicle {
    private final String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber; // Immutable
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty");
        }
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate <= 0) {
            throw new IllegalArgumentException("Rental rate must be greater than zero");
        }
        this.rentalRate = rentalRate;
    }

    // Abstract method for calculating rental cost
    public abstract double calculateRentalCost(int days);

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}

