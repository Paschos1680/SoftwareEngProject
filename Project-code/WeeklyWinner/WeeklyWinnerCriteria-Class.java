import java.util.Date;

public class WeeklyWinnerCriteria {
    
    private static final int MINPOINTS;
    
    public WeeklyWinnerCriteria() {
    }
    
    public boolean checkFriendsExistence() {
        return true;
    }
    
    public boolean checkPointsExistence(Date calendarWeek) {
        if(MINPOINTS > 0)
        return true;
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

        return 0;
    }
    
    public void displayWeeklyWinnerMessage(Date calendarWeek) {
        boolean isEligible = checkWeeklyWinnerEligibility(calendarWeek);
        
        if (isEligible) {
            System.out.println("Congratulations! You are in the weekly winner contest!");
        } else {
            System.out.println("Keep working hard to earn  points and become the weekly winner!");
        }
    }
}
