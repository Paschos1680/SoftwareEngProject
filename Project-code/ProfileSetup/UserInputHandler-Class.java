public class UserInputHandler extends Food, Recipe {
  
    public UserInputHandler(String name, double calories, double servingSize, String mealType) {
        super(name, calories, servingSize, mealType);
    }
  
    public boolean checkFoodExistence() {
       
        return false;
    }
  
    public boolean checkRecipeExistence() {
       
        return false;
    }
  
    public String promptInabilityMessage() {
        
        return "Inability message";
    }
}