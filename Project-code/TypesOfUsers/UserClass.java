public class User {
    private int id;
    private String username;
    private String email;
    private String profilePicture;
    private Date selectedDay;

    public User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void selectDay(Date selectedDay) {
        this.selectedDay = selectedDay;
    }

    public int getUserId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
