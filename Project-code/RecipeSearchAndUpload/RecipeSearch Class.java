import java.time.LocalDateTime;

public class RecipeSearch {
    private String searchedRecipeName;
    private float averageRating;
    private int ratingCount;
    private String createdBy;
    private LocalDateTime creationDate;

    public RecipeSearch(String searchedRecipeName, float averageRating, int ratingCount, String createdBy, LocalDateTime creationDate) {
        this.searchedRecipeName = searchedRecipeName;
        this.averageRating = averageRating;
        this.ratingCount = ratingCount;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
    }

    public void displayPopularRecipes(String searchedRecipeName) {
        System.out.println("Displaying popular recipes for: " + searchedRecipeName);
    }

    public void displayHighlyRatedRecipes(String searchedRecipeName) {
        System.out.println("Displaying highly rated recipes for: " + searchedRecipeName);
    }

    public void searchRecipe(String searchedRecipeName) {
        System.out.println("Searching for recipe: " + searchedRecipeName);
    }

    public String uploadRecipeRequest() {
        return "Recipe upload request successful.";
    }

    public double rateRecipe() {
        ratingCount++;
        averageRating = (averageRating * (ratingCount - 1) + newRating) / ratingCount;
        return averageRating;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
