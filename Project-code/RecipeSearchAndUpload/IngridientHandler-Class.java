public class IngridientHandler extends RecipeUpload {

    private String ingridientName;

    public IngridientHandler(String name, double calories, double servingSize, String mealType, String ingridientName) {
        super(name, calories, servingSize, mealType);
        this.ingridientName = ingridientName;
    }

    public void displaySimilarIngredients(String ingridientName) {
       
    }

    public void selectSimilarIngridient(String ingridientName) {
       
    }
}