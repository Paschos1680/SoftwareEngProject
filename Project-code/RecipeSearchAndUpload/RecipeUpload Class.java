
public class RecipeUpload {
    private String recipeName;
    private String instructions;
    private List<String> ingredients;

    public RecipeUpload(String recipeName, String instructions, List<String> ingredients) {
        this.recipeName = recipeName;
        this.instructions = instructions;
        this.ingredients = ingredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }

    public void displayRecipe() {
        System.out.println("Recipe: " + recipeName);
        System.out.println("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Instructions: ");
        System.out.println(instructions);
    }
}
