import java.util.Date;

public class WeeklyWinnerCriteria {
    
    private static final int MIN_POINTS_THRESHOLD = 100;
    
    public WeeklyWinnerCriteria() {
        // Constructor
    }
    
    public boolean checkFriendsExistence() {
        // Check if friends exist
        // ...
        // More code here
        // ...
        return false;
    }
    
    public boolean checkPointsExistence(Date calendarWeek) {
        // Check if points exist for the specified calendar week
        // ...
        // More code here
        // ...
        return false;
    }
    
    public boolean checkWeeklyWinnerEligibility(Date calendarWeek) {
        boolean friendsExist = checkFriendsExistence();
        boolean pointsExist = checkPointsExistence(calendarWeek);
        
        if (friendsExist && pointsExist) {
            int totalPoints = calculateTotalPoints(calendarWeek);
            return totalPoints >= MIN_POINTS_THRESHOLD;
        }
        
        return false;
    }
    
    private int calculateTotalPoints(Date calendarWeek) {
        // Calculate the total points for the specified calendar week
        // ...
        // More code here
        // ...
        return 0;
    }
    
    public void displayWeeklyWinnerMessage(Date calendarWeek) {
        boolean isEligible = checkWeeklyWinnerEligibility(calendarWeek);
        
        if (isEligible) {
            System.out.println("Congratulations! You are the weekly winner!");
        } else {
            System.out.println("Keep working hard to earn more points and become the weekly winner!");
        }
    }
}