

public class InitialPositionHandler {

    private String initialPosition;

    public InitialPositionHandler(String initialPosition) {
        this.initialPosition = initialPosition;
    }

    public String getInitialPosition() {
        // Make API call to retrieve user's initial position
        double latitude = GPSAPI.getLatitude();
        double longitude = GPSAPI.getLongitude();

        // Update the initial position
        this.initialPosition = "Latitude: " + latitude + ", Longitude: " + longitude;

        return initialPosition;
    }
}