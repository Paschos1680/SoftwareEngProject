

import java.util.ArrayList;
import java.util.List;

public class RecipeSearch {
    private List<String> recipes;

    public RecipeSearch() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(String recipe) {
        recipes.add(recipe);
    }

    public void removeRecipe(String recipe) {
        recipes.remove(recipe);
    }

    public void displayRecipes() {
        System.out.println("Available Recipes:");
        for (String recipe : recipes) {
            System.out.println("- " + recipe);
        }
    }
}
