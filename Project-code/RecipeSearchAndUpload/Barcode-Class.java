public class Barcode extends Food {
    private String barcodeValue;

    public Barcode(String name, double calories, double servingSize, String mealType, String barcodeValue) {
        super(name, calories, servingSize, mealType);
        this.barcodeValue = barcodeValue;
    }

    public boolean searchForValue(String barcodeValue) {
        
        return false;
    }

    public String promptInabilityValueMessage() {
       
        return "Inability value message";
    }
}