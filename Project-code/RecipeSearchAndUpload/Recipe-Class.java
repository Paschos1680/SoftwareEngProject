public class Recipe {
    private String recipeName;
    private String recipeCalories;
    private double recipePortion;

    public Recipe(String recipeName, String recipeCalories, double recipePortion) {
        this.recipeName = recipeName;
        this.recipeCalories = recipeCalories;
        this.recipePortion = recipePortion;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeCalories() {
        return recipeCalories;
    }

    public double getRecipePortion() {
        return recipePortion;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setRecipeCalories(String recipeCalories) {
        this.recipeCalories = recipeCalories;
    }

    public void setRecipePortion(double recipePortion) {
        this.recipePortion = recipePortion;
    }

    public void printRecipeDetails() {
        System.out.println("Recipe Name: " + recipeName);
        System.out.println("Recipe Calories: " + recipeCalories);
        System.out.println("Recipe Portion: " + recipePortion);
    }
}
