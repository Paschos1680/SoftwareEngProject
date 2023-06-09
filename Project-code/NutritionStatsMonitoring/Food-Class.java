public class Food {
    private String name;
    private double calories;
    private double servingSize;
    private String mealType;

    public Food(String name, double calories, double servingSize, String mealType) {
        this.name = name;
        this.calories = calories;
        this.servingSize = servingSize;
        this.mealType = mealType;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getServingSize() {
        return servingSize;
    }

    public String getMealType() {
        return mealType;
    }

    public String similarFoodRequest(String foodName) {
        // Perform logic to search for similar food based on provided food name
        // and return the result as a string
        return "Similar food request for " + foodName;
    }
}