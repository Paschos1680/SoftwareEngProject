public class WorkoutUser extends User {
    private String workout;

    public WorkoutUser(String username, String email) {
        super(username, email);
    }

    public void createMyWorkout() {
        System.out.println("Creating my workout...");
    }

    public void chooseType(String workoutType) {
        System.out.println("Choosing workout type: " + workoutType);
        // Your logic to choose the workout type
    }

    public void selectOtherWorkoutType(String workoutType) {
        System.out.println("Selecting other workout type: " + workoutType);
    }

    public void chooseWorkout() {
        System.out.println("Choosing workout...");
    }

    public void startWorkout(String workout) {
        this.workout = workout;
        System.out.println("Starting " + workout + " workout...");
    }

    public void endWorkout(String workout) {
        this.workout = workout;
        System.out.println("Ending " + workout + " workout...");
    }

    public void acceptChartsRedirection() {
        System.out.println("Accepting charts redirection...");
    }

    public void denyChartsRedirection() {
        System.out.println("Denying charts redirection...");
    }

    public void earlyTermination(String workout) {
        this.workout = workout;
        System.out.println("Performing early termination of " + workout + " workout...");
    }
}
