package ridehailingapp;

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
