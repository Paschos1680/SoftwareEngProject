public class UserInputHandler {
    public UserInputHandler(String name) {
        super(name);
    }

    public boolean checkFoodExistence() {

        FoodDatabase foodDatabase = FoodDatabase.getInstance();  // θεωρώντας ότι υπάρχει βάση
        boolean foodExists = foodDatabase.checkFoodExists(getName());
        return foodExists;
    }

    public boolean checkRecipeExistence() {

        RecipeDatabase recipeDatabase = RecipeDatabase.getInstance();  // θεωρώντας ότι υπάρχει βάση

        boolean recipeExists = recipeDatabase.checkRecipeExists(getName());

        return recipeExists;
    }

    public String promptInabilityMessage() {
        return "The requested item does not exist.";
    }
}
