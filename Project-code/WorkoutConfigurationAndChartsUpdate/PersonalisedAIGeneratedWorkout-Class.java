public class PersonalisedAIGeneratedWorkout extends WorkoutConfiguration {
    private String personalisedAIGeneratedWorkout;
    private String missingDetailsMessage;
    private String AIWorkouts;

    public PersonalisedAIGeneratedWorkout(String personalisedAIGeneratedWorkout, String missingDetailsMessage, String AIWorkouts) {
        this.personalisedAIGeneratedWorkout = personalisedAIGeneratedWorkout;
        this.missingDetailsMessage = missingDetailsMessage;
        this.AIWorkouts = AIWorkouts;
    }

    public boolean checkAIAvailability() {
        return AIEngine.isRunning();
    }

    
       public void profileSetup() {
        user.setAIEnabled(true);
        user.setAIGeneratedWorkoutMode(true);
        System.out.println("Profile setup for AI-generated workouts completed.");
    }

    public void displayAIPrograms(String AIWorkouts) {
        System.out.println("Available AI Workout Programs:\n" + AIWorkouts);
    }

    public String generateAIPrograms() {
        String generatedPrograms = AIAlgorithm.generateWorkoutProgram(user);
        return generatedPrograms;
    }

    public boolean isWorkoutModeEnabled() {
        return user.isWorkoutModeEnabled();
    }
}
