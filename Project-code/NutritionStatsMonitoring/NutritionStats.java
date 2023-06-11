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
      
        return "Food entry registered successfully.";
    }

    public String registerRecipe() {
        
        return "Recipe entry registered successfully.";
    }

    public double registerWater() {
        
        return 0.0;
    }

    public String deleteFoodRegistration() {
    
        
        return "Food registration deleted successfully.";
    }

    public String deleteRecipeRegistration() {
        
        
        return "Recipe registration deleted successfully.";
    }

    public String deleteWaterRegistration() {
       
        
        return "Water registration deleted successfully.";
    }

    public double editFoodRegistration() {
       
        return 0.0;
    }

    public double editRecipeRegistration() {
      
     
        return 0.0;
    }

    public double editWaterRegistration() {
       
        return 0.0;
    }
}
