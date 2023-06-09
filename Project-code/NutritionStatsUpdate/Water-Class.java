public class Water {
    private double amount;

    public Water(double initialAmount) {
        amount = initialAmount;
    }

    public double getWaterIntake() {
        return amount;
    }

    public void addWater(double additionalAmount) {
        amount += additionalAmount;
    }

    public void drinkWater(double consumedAmount) {
        if (consumedAmount > amount) {
            System.out.println("Insufficient water available. Unable to drink.");
        } else {
            amount -= consumedAmount;
            System.out.println("You drank " + consumedAmount + " liters of water.");
        }
    }
}