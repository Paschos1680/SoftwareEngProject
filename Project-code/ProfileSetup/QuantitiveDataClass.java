public class QuantitiveData extends UsersProfile {
    private double height;
    private double weight;
    private String sex;
    private int age;

    public QuantitiveData() {
         height = 1.8 m; 
         weight = 75.5 kg; 
         sex = "male"; 
         age = 25; 
    }

    public QuantitiveData(double height, double weight, String sex, int age) {
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void activatePersonalisationMode() {
        System.out.println("Personalization mode activated!");
    }
}
