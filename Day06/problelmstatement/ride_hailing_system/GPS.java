package problelmstatement.ride_hailing_system;

// Interface to represent GPS functionality
public interface GPS {
    String getCurrentLocation();       // Method to get the current location
    void updateLocation(String location); // Method to update the location
}
