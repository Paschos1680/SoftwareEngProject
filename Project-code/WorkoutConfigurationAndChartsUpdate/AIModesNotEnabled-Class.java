public class AIModesNotEnabled extends PersonalisedAIGeneratedWorkout {
    public AIModesNotEnabled(String personalisedAIGeneratedWorkout, String missingDetailsMessage, String AIWorkouts) {
        super(personalisedAIGeneratedWorkout, missingDetailsMessage, AIWorkouts);
    }

    public boolean detectMissingDetails() {
        boolean missingDetails = false;
        if (getPersonalisedAIGeneratedWorkout() == null || getMissingDetailsMessage() == null || getAIWorkouts() == null) {
            missingDetails = true;
        }
        
        return missingDetails;
    }

    public String displayMissingDetailsMessage() {
        return "Please provide the details (2 questions) missing from your profile for access to the AI mode.";
    }

    public String redirectToProfileMessageRequest() {
        return "Do you want to go to your profile to provide the missing details?";
    }

    public void acceptProfileRedirection() {
        System.out.println("Redirecting to the profile page...");
    }

    public void denyProfileRedirection() {
        System.out.println("Continuing without providing the missing details, but You have to select a different type of workout");
    }
