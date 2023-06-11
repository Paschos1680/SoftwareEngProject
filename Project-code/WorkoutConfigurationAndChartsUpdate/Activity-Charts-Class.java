public class ActivityChartsDay extends Training {
    private String chartsMessage;

    public ActivityChartsDay(String trainingConfiguration) {
        super(trainingConfiguration);
        this.chartsMessage = "";
    }

    public boolean activityChartsRedirectionRequest() {

        System.out.println("Do you want to be redirected to activity charts? (yes/no)");
        String choice = getUserInput();

       
        if (choice.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public String promptChartsAvailabilityMessage() {


        return "Activity charts are available for your training. Would you like to view them?";
    }

    public void generateCharts(ActivityStatsDay activityStats) {


       
        System.out.println("Generating activity charts for the selected day...");

        
        System.out.println("Activity charts generated:");
        System.out.println("Chart 1: ...");
        System.out.println("Chart 2: ...");
        System.out.println("Chart 3: ...");
    }

    public void displayCharts() {


        System.out.println("Displaying activity charts...");
       
    }

    public String displayInabilityMessage() {
    

        return "Unable to generate activity charts for the selected day. Please try again later.";
    }

    private String getUserInput() {


        return "yes"; 
    }
}
