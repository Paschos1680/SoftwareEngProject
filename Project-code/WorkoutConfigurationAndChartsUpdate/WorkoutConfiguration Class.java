public class WorkoutConfiguration {
    private String workoutType;

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public void displayWorkoutConfOptions(String workoutType) {
        switch (workoutType) {
            case "PersonalisedAIGeneratedWorkout":
                System.out.println("Options for Personalised AI-Generated Workout:");
                break;
            case "TrainingPackage":
                System.out.println("Options for Training Package:");
                break;
            case "WorkoutConfigurationByUser":
                System.out.println("Options for Workout Configuration by User:");
                break;
            default:
                System.out.println("Invalid workout type!");
        }
    }
}
