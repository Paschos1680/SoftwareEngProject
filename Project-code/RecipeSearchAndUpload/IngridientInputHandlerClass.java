public class IngredientHandler extends RecipeUpload {
    private String ingredientName;

    public IngredientHandler(String searchedRecipeName, float averageRating, int ratingCount, String createdBy, LocalDateTime creationDate,
                             String name, String ingredients, String process, double calories, String ingredientName) {
        super(searchedRecipeName, averageRating, ratingCount, createdBy, creationDate, name, ingredients, process, calories);
        this.ingredientName = ingredientName;
    }

    public void displaySimilarIngredients(String ingredientName) {
        System.out.println("Can't find searched Ingridient. Displaying similar results for: " + ingredientName);
    }
}
