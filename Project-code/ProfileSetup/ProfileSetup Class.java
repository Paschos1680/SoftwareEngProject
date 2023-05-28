ProfileSetup Class:

java

public class ProfileSetup {
    private String username;
    private int age;
    private String gender;

    public ProfileSetup(String username, int age, String gender) {
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    public void displayProfile() {
        System.out.println("Profile Information:");
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}