public class PersonalisedAIModes extends UsersProfile {
    private boolean AIGeneratedWorkoutMode;
    private boolean AICaloriePlan;
    private char response1;
    private char response2;
    private char response3;
    private char response4;
    private char response5;
    private char response6;

    public void checkForResponses(char response1, char response2, char response3, char response4, char response5, char response6) {
        if (response1 == 'Y' && response2 == 'Y') {
            enableAIGeneratedWorkout();
        }


        if (response3 == 'Y' && response4 == 'Y' && response5 == 'Y' && response6 == 'Y') {
            enableAICaloriePlan();
        }
    }

    public void enableAIGeneratedWorkout() {
        AIGeneratedWorkoutMode = true;
        System.out.println("AI-generated workout mode enabled.");
    }

    public void enableAICaloriePlan() {
        AICaloriePlan = true;
        System.out.println("AI-calorie plan enabled.");
    }
}
