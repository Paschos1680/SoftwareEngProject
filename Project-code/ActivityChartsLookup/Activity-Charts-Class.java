
import java.util.HashMap;
import java.util.Map;

public class ActivityCharts {
    private Map<String, Integer> activityTime;

    public ActivityCharts() {
        activityTime = new HashMap<>();
    }

    public void addActivityTime(String activity, int time) {
        activityTime.put(activity, time);
    }

    public void removeActivityTime(String activity) {
        activityTime.remove(activity);
    }

    public int getTotalTime() {
        int totalTime = 0;
        for (int time : activityTime.values()) {
            totalTime += time;
        }
        return totalTime;
    }

    public void displayActivities() {
        for (Map.Entry<String, Integer> entry : activityTime.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " minutes");
        }
    }
}
