public class NutritionStats {
    private double kcalGoal;
    private double caloriesBurnt;
    private double caloriesEaten;
    private double kcalAvailable;
    private double nutritionRecords;

    public double getKcalGoal() {
        return kcalGoal;
    }

    public double getCaloriesBurnt() {
        return caloriesBurnt;
    }

    public double getCaloriesEaten() {
        return caloriesEaten;
    }

    public double getKcalAvailable() {
        return kcalAvailable;
    }

    public double getNutritionRecords() {
        return nutritionRecords;
    }

    public void removeKcalGoalStat() {
        kcalGoal = 0.0;
    }

    public void removeKcalAvailableStat() {
        kcalAvailable = 0.0;
    }

    public void removeKcalBurntStat() {
        caloriesBurnt = 0.0;
    }

    public String informAbsenceOfData() {
        return "No nutrition data available.";
    }

    public String registerFood() {
        // Register food entry logic
       
        return "Food entry registered successfully.";
    }

    public String registerRecipe() {
        // Register recipe entry logic
       
        return "Recipe entry registered successfully.";
    }

    public double registerWater() {
        // Register water intake logic
        
        return 0.0;
    }

    public String deleteFoodRegistration() {
        // Delete food registration logic
        
        return "Food registration deleted successfully.";
    }

    public String deleteRecipeRegistration() {
        // Delete recipe registration logic
        
        return "Recipe registration deleted successfully.";
    }

    public String deleteWaterRegistration() {
        // Delete water registration logic
        
        return "Water registration deleted successfully.";
    }

    public double editFoodRegistration() {
        // Edit food registration logic
        // ...
        return 0.0;
    }

    public double editRecipeRegistration() {
        // Edit recipe registration logic
     
        return 0.0;
    }

    public double editWaterRegistration() {
        // Edit water registration logic
        
        return 0.0;
    }
}