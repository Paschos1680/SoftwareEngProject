

public class Main {
    public static void main(String[] args) {
        ProfileSetup profile = new ProfileSetup("JohnDoe", 25, "Male");
        profile.displayProfile();

        RecipeUpload recipe = new RecipeUpload("Pasta Carbonara", "Instructions here...", new ArrayList<>());
        recipe.addIngredient("Pasta");
        recipe.addIngredient("Bacon");
        recipe.addIngredient("Eggs");
        recipe.displayRecipe();

        RecipeSearch recipeSearch = new RecipeSearch();
        recipeSearch.addRecipe("Pasta Carbonara");
        recipeSearch.addRecipe("Chicken Curry");
        recipeSearch.displayRecipes();

        NutritionMonitoring nutrition = new NutritionMonitoring();
        nutrition.addIntake("Protein", 50);
        nutrition.addIntake("Carbohydrates", 100);
        nutrition.displayIntake();

        ActivityCharts activityCharts = new ActivityCharts();
        activityCharts.addActivityTime("Running", 30);
        activityCharts.addActivityTime("Swimming", 45);
        activityCharts.displayActivities();

        PenaltyAdministration penaltyAdmin = new PenaltyAdministration();
        penaltyAdmin.addPenalty("Late submission");
        penaltyAdmin.addPenalty("Incomplete work");
        penaltyAdmin.displayPenalties();
    }
}
