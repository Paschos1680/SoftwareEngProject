public class UsersProfile extends User {
    public UsersProfile(String username) {
        super(username);
    }

    public void updateUsersProfile() {
        System.out.println("Updating user's profile...");
        System.out.println("User profile has been updated.");
    }

    public void deleteProfileData() {
        System.out.println("Deleting user's profile data...");
        System.out.println("User profile data has been deleted.");
    }

    public void profileSetupCompletion() {
        System.out.println("Profile setup completed!");
        System.out.println("Thank you for completing your profile.");
    }
}
