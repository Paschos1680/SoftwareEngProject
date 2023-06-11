public class NutritionStats {
    private double kcalGoal;
    private double caloriesBurnt;
    private double caloriesEaten;
    private double kcalAvailable;
    private double nutritionRecords;

    public NutritionStats(double kcalGoal, double caloriesBurnt, double caloriesEaten, double kcalAvailable, double nutritionRecords) {
        this.kcalGoal = kcalGoal;
        this.caloriesBurnt = caloriesBurnt;
        this.caloriesEaten = caloriesEaten;
        this.kcalAvailable = kcalAvailable;
        this.nutritionRecords = nutritionRecords;
    }

    public double getKcalGoal() {
        return kcalGoal;
    }

    public double getKcalBurnt() {
        return caloriesBurnt;
    }

    public double getKcalEaten() {
        return caloriesEaten;
    }

    public double getKcalAvailable() {
        return kcalAvailable;
    }

    public double getNutritionRecords() {
        return nutritionRecords;
    }

    public void removeKcalGoalStat() {
        kcalGoal = 0;
    }

    public void removeKcalAvailableStat() {
        kcalAvailable = 0;
    }

    public void removeKcalBurntStat() {
        caloriesBurnt = 0;
    }

    public String informAbsenceOfData() {
        if (kcalGoal == 0 && caloriesBurnt == 0 && caloriesEaten == 0 && kcalAvailable == 0 && nutritionRecords == 0) {
            return "No nutrition data available.";
        } else {
            return "Nutrition data available.";
        }
    }

    public String registerFood() {
        return "Food registration successful.";
    }

    public String registerRecipe() {

        return "Recipe registration successful.";
    }

    public double registerWater(double amount) {
        return amount;
    }

    public String deleteFoodRegistration() {
        return "Food registration deleted.";
    }

    public String deleteRecipeRegistration() {
        return "Recipe registration deleted.";
    }

    public String deleteWaterRegistration() {
        return "Water registration deleted.";
    }

    public double editFoodRegistration() {
        return caloriesEaten;
    }

    public double editRecipeRegistration() {
        return caloriesEaten;
    }

    public double editWaterRegistration() {
        return kcalAvailable;
    }
}
