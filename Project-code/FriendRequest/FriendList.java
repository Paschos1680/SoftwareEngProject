import java.util.ArrayList;
import java.util.List;

public class Friendslist {
    private String username;
    private List<String> friendsList;

    public Friendslist(String username) {
        this.username = username;
        this.friendsList = new ArrayList<>();
    }

    public void updateFriendsList(String addUser) {
        friendsList.add(addUser);
    }

    public String getUsersFriendsList() {
        StringBuilder sb = new StringBuilder();
        sb.append("Friends list for ").append(username).append(":\n");
        for (String friend : friendsList) {
            sb.append(friend).append("\n");
        }
        return sb.toString();
    }

    public void addFriend(String communityUsername) {
        friendsList.add(communityUsername);
        System.out.println(communityUsername + " added to friends list.");
    }

    public String removeFriend(String communityUsername) {
        boolean removed = friendsList.remove(communityUsername);
        if (removed) {
            return communityUsername + " removed from friends list.";
        } else {
            return communityUsername + " is not in your friends list.";
        }
    }

    public boolean isFriendsWith(String communityUsername) {
        return friendsList.contains(communityUsername);
    }
}
