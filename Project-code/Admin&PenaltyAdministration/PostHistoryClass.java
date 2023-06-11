public class PostHistory extends Post {
    private String userPostHistory;

    public PostHistory(String content, String author) {
        super(content, author);
        this.userPostHistory = "";
    }

    public String getUserPostHistory() {
        return userPostHistory;
    }

    public void setUserPostHistory(String userPostHistory) {
        this.userPostHistory = userPostHistory;
    }

    public void GetUsersPostHistory() {
        if (userPostHistory.isEmpty()) {
            System.out.println("User post history is empty.");
        } else {
            System.out.println("User post history:");
            String[] postHistory = userPostHistory.split(",");
            for (String post : postHistory) {
                System.out.println(post);
            }
        }
    }
}
