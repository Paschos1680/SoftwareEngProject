public class WorkoutConfigurationByUser extends WorkoutConfiguration {
    private String trainingConfigurationByUser;
    private String muscleGroups;
    private String exercises;
    private String infeasibleProgramMessage;

    public String getMuscleGroupsSetting() {
        return muscleGroups;
    }

    public void setMuscleGroupSetting(String muscleGroups) {
        this.muscleGroups = muscleGroups;
    }

    public String getExercisesSetting() {
        return exercises;
    }

    public void setExercisesSetting(String exercises) {
        this.exercises = exercises;
    }

    public boolean checkProgramFeasibility() {
        if (muscleGroups.isEmpty() || exercises.isEmpty()) {
            return false;
        } else {
           
            return true;
        }
    }

    public String displayProgramInfeasibilityMessage() {
        if (muscleGroups.isEmpty() && exercises.isEmpty()) {
            infeasibleProgramMessage = "Muscle groups and exercises are not set.";
        } else if (muscleGroups.isEmpty()) {
            infeasibleProgramMessage = "Muscle groups are not set.";
        } else if (exercises.isEmpty()) {
            infeasibleProgramMessage = "Exercises are not set.";
        } else {
           
            infeasibleProgramMessage = "Program configuration is infeasible.";
        }

        return infeasibleProgramMessage;
    }

}
