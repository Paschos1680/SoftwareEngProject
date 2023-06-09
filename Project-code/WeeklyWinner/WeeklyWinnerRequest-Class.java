public class WeeklyWinnerRequest {
    public boolean checkWeeklyWinnerAvailability() {
        // Implement the logic to check if weekly winner is available
        // For example, you can check if the current date is within the valid range for the weekly winner announcement
        LocalDate currentDate = LocalDate.now();
        LocalDate weeklyWinnerDate = LocalDate.of(2023, 5, 30); // Assuming the weekly winner is announced on May 30, 2023
        return currentDate.isEqual(weeklyWinnerDate);
    }

    public String weeklyWinnerParticipationRequest() {
        // Implement the logic to handle the request for weekly winner participation
        // For example, you can prompt the user to enter their details or perform any required actions
        // Return a message indicating the successful participation request
        return "Your participation request for the weekly winner has been received.";
    }
}