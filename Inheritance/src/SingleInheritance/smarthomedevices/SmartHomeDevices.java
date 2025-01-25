package SingleInheritance.smarthomedevices;

public class SmartHomeDevices {
    // Main method
    public static void main(String[] args) {

        // Create an instance of Thermostat
        Thermostat thermostat = new Thermostat("TH12345", "Active", 22);

        // Display the thermostat's status
        thermostat.displayStatus();
    }
}
