public class NutritionChartsDay {
    public void generateNutritionCharts(NutritionStats nutritionStats) {
        System.out.println("Generating nutrition charts...");
 
        double kcalGoal = nutritionStats.getKcalGoal();
        double caloriesBurnt = nutritionStats.getKcalBurnt();
        double caloriesEaten = nutritionStats.getKcalEaten();
        double kcalAvailable = nutritionStats.getKcalAvailable();

        System.out.println("Calories Eaten: " + caloriesEaten);
        System.out.println("Calories Goal: " + kcalGoal);
        System.out.println("Generating bar chart...");
        System.out.println("Nutrition charts generated.");
    }

    public void displayCharts() {
        System.out.println("Displaying nutrition charts...");
        System.out.println("Displaying bar chart...");
        System.out.println("Nutrition charts displayed.");
    }
}
