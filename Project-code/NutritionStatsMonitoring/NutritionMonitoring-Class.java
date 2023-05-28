NutritionMonitoring Class:

java

import java.util.HashMap;
import java.util.Map;

public class NutritionMonitoring {
    private Map<String, Integer> dailyIntake;

    public NutritionMonitoring() {
        dailyIntake = new HashMap<>();
    }

    public void addIntake(String nutrient, int amount) {
        if (dailyIntake.containsKey(nutrient)) {
            int currentAmount = dailyIntake.get(nutrient);
            dailyIntake.put(nutrient, currentAmount + amount);
        } else {
            dailyIntake.put(nutrient, amount);
        }
    }

    public void removeIntake(String nutrient) {
        dailyIntake.remove(nutrient);
    }

    public void displayIntake() {
        System.out.println("Nutrition Intake:");
        for (Map.Entry<String, Integer> entry : dailyIntake.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " grams");
        }
    }
}