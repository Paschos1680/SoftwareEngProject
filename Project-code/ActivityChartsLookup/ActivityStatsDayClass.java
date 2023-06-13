import java.util.Date;

public class ActivityStatsDay extends Training {
    private String activityStatsData; 
    
    public ActivityStatsDay(String trainingConfiguration) {
        super(trainingConfiguration);
        activityStatsData = ""; 
    }
    
    public boolean checkActivityStats(Date calendarDay) {
       
        return true;
    }
    
    public void getActivityStats(Date calendarDay) {
        
        System.out.println("Retrieving activity stats for: " + calendarDay);
        
     
        

        activityStatsData = "Steps: 10000, Distance: 5.0 km, Calories Burned: 500";
    }
    
   
    public String getActivityStatsData() {
        return activityStatsData;
    }
}
