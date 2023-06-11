public class AIModesNotEnabled extends PersonalisedAIGeneratedWorkout implements CheckBeforeShowingStats {
    public AIModesNotEnabled(String personalisedAIGeneratedWorkout) {
        super(personalisedAIGeneratedWorkout);
    }

    public boolean detectMissingDetails() {
     
        return ;
    }

    public String displayMissingDetailsMessage() {
        // Display a message indicating that some details are missing for AI modes
        return "Missing details for AI modes. Please update your preferences.";
    }

    public String redirectToProfileMessageRequest() {
        
        return "Please redirect to the profile page to update your preferences.";
    }

    public void acceptProfileRedirection() {
        
    }

    public void denyProfileRedirection() {
        
    }
}