

public class InitialPositionHandler {

    private String initialPosition;

    public InitialPositionHandler(String initialPosition) {
        this.initialPosition = initialPosition;
    }

    public String getInitialPosition() {
        
        double latitude = GPSAPI.getLatitude();
        double longitude = GPSAPI.getLongitude();

       
        this.initialPosition = "Latitude: " + latitude + ", Longitude: " + longitude;

        return initialPosition;
    }
}
