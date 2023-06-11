import java.time.LocalDateTime;

public class RecipeUpload extends RecipeSearch {
    private String name;
    private String ingredients;
    private String process;
    private double calories;

    public RecipeUpload(String searchedRecipeName, float averageRating, int ratingCount, String createdBy, LocalDateTime creationDate,
                        String name, String ingredients, String process, double calories) {
        super(searchedRecipeName, averageRating, ratingCount, createdBy, creationDate);
        this.name = name;
        this.ingredients = ingredients;
        this.process = process;
        this.calories = calories;
    }

    public void createRecipe(String name) {
        System.out.println("Creating recipe: " + name);
    }

    public void submitRecipe() {
        System.out.println("Submitting recipe: " + name);
    }

    public void updateIngredients() {
        System.out.println("Updating ingredients for recipe: " + ingredients);
    }

    public void updateProcess() {
        System.out.println("Updating process for recipe: " + process);
    }

    public void calculateCalories() {
        System.out.println("Calculating calories for recipe: " + name);
    }

    public String getCreatedBy(String username) {
        return createdBy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
