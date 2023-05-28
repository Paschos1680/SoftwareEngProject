public class Training {
    private Double workoutCalories;
    private int steps;
    private String distance;
    private long points;

    private List<String> exercises;
    private Map<String, Integer> repsCountMap;

    public Training() {
        exercises = new ArrayList<>();
        repsCountMap = new HashMap<>();
    }

    public void addExercise(String exerciseName, int repsCount) {
        exercises.add(exerciseName);
        repsCountMap.put(exerciseName, repsCount);
    }

    public void updateStatistics(Double workoutCalories, int steps, String distance, long points) {
        this.workoutCalories = workoutCalories;
        this.steps = steps;
        this.distance = distance;
        this.points = points;
    }

    public void showRealTimeStatistics() {
        System.out.println("Calories Burned: " + workoutCalories);
        System.out.println("Steps: " + steps);
        System.out.println("Distance: " + distance);
        System.out.println("Points Earned: " + points);
    }

    public void earlyProgramTermination() {
        System.out.println("Program terminated early.");
    }

    public void displayWorkoutSummary() {
        System.out.println("Workout Summary:");
        for (String exercise : exercises) {
            int repsCount = repsCountMap.getOrDefault(exercise, 0);
            System.out.println(exercise + ": " + repsCount + " reps");
        }
    }
}