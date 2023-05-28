public class WorkoutUser extends User {
    public void createMyWorkout() {
        WorkoutConfigurationByUser workoutConfByUser = new WorkoutConfigurationByUser();
        workoutConfByUser.setMuscleGroups("Chest, Back");
        workoutConfByUser.setExercises("Bench press, Pull-ups");
    }

    public void chooseType(String workoutType) {
        WorkoutConfiguration workoutConf = new WorkoutConfiguration();
        workoutConf.displayWorkoutConfOptions(workoutType);
        
    }

    public void selectOtherWorkoutType(String workoutType) {
        WorkoutConfiguration workoutConf = new WorkoutConfiguration();
        workoutConf.displayWorkoutConfOptions(workoutType);
        // Handle user's selection of another workout type
        // ...
    }

    public void chooseWorkout() {
        TrainingPackage trainingPackage = new TrainingPackage();
        trainingPackage.displayPackage("Full Body Workout");
    }

    public void startWorkout() {
        TrainingPackage trainingPackage = new TrainingPackage();
        trainingPackage.setDifficultySetting("Intermediate");
        trainingPackage.setDurationSetting(60);
    }

    public void endWorkout() {
        ActivityStatsDay activityStats = new ActivityStatsDay();
        activityStats.calculateCaloriesBurned(500);
        activityStats.updateSteps(10000);
    }

    public void acceptChartsRedirection() {
        ActivityChartsDay charts = new ActivityChartsDay();
        charts.generateCharts(activityStats);
        charts.displayCharts();
    }

    public void denyChartsRedirection() {
        ActivityChartsDay charts = new ActivityChartsDay();
        String inabilityMsg = charts.displayInabilityMessage();
        System.out.println(inabilityMsg);
    }

    public void earlyTermination() {
        Training training = new Training();
        training.earlyProgramTermination();
    }
}
