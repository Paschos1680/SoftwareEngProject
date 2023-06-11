

public class MapTraining {
    private String mapPosition;
    private String startingPoint;

    public MapTraining(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public void locateStartingPosition(String startingPoint) {
        this.startingPoint = startingPoint;

        if (GPS.isAvailable()) {
            GPS.startTracking();
            GPS.setLocationListener((location) -> {

                System.out.println("Starting position located: " + startingPoint);
            });
        } else {
            System.out.println("GPS not available. Unable to locate starting position.");
        }
    }

    public void startMapTraining() {
        System.out.println("Map training started. Follow the route on the map.");

        if (GPS.isAvailable()) {
            GPS.startTracking();
            GPS.setLocationListener((location) -> {

            });
        } else {
            System.out.println("GPS not available. Map training cannot be started.");
        }
    }

    public void finishMapTraining() {
        System.out.println("Map training finished. Congratulations!");

        if (GPS.isTracking()) {
            GPS.stopTracking();
            GPS.setLocationListener(null);

        } else {
            System.out.println("GPS tracking not active. Map training cannot be finished.");
        }
    }

    public void updateActivityStatistics(ActivityStatsDay activityStats) {

        activityStats.incrementDistanceTraveled(GPS.getTotalDistance());
        activityStats.incrementCaloriesBurned(GPS.getCaloriesBurned());
        System.out.println("Activity statistics updated.");
    }

    public boolean checkFriendsRoutes() {

        boolean friendsRoutesAvailable = Friends.getSharedRoutes().size() > 0;
        return friendsRoutesAvailable;
    }

    public void publishRouteOnMap() {

        MapRoute userRoute = GPS.getRoute();
        userRoute.publish();
        Friends.shareRoute(userRoute);
        System.out.println("Route published on the map.");
    }

    public void showActivityCharts(ActivityChartsDay activityCharts) {

        activityCharts.generateCharts();
        activityCharts.display();
        System.out.println("Activity charts displayed.");
    }
}
