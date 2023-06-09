import java.util.List;

public class Recipe {
    private String name;
    private List<String> ingredients;
    private String instructions;
    private int servings;

    public Recipe(String name, List<String> ingredients, String instructions, int servings) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.servings = servings;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getServings() {
        return servings;
    }

    public String searchRecipe(String keyword) {
        // Perform logic to search for recipes based on the provided keyword
        // and return the result as a string
        return "Search recipe for keyword: " + keyword;
    }

    public void uploadRecipe() {
        
    }
}