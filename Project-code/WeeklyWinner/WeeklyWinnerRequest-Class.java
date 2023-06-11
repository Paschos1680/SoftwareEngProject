public class WeeklyWinnerRequest {
    public boolean checkWeeklyWinnerAvailability() {
        LocalDate currentDate = LocalDate.now();
        LocalDate weeklyWinnerDate = LocalDate.of(2023, 5, 30);
        return currentDate.isEqual(weeklyWinnerDate);
    }

    public String weeklyWinnerParticipationRequest() {
        return "Your participation request for the weekly winner has been received.";
    }
}
