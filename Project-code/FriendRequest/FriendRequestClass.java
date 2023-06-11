import java.util.ArrayList;
import java.util.List;

class FriendRequest {
    private User sender;
    private User receiver;
    private String status;

    public FriendRequest(User sender, User receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.status = "pending";
    }

    public void accept() {
        if (status.equals("pending")) {
            status = "accepted";
            sender.getFriends().add(receiver);
            receiver.getFriends().add(sender);
            sender.getNotifications().add("Your friend request to " + receiver.getUsername() + " has been accepted.");
            receiver.getNotifications().add("You accepted a friend request from " + sender.getUsername() + ".");
        } else {
            System.out.println("Friend request has already been accepted or rejected.");
        }
    }

    public void reject() {
        if (status.equals("pending")) {
            status = "rejected";
            sender.getNotifications().add("Your friend request to " + receiver.getUsername() + " has been rejected.");
            receiver.getNotifications().add("You rejected a friend request from " + sender.getUsername() + ".");
        } else {
            System.out.println("Friend request has already been accepted or rejected.");
        }
    }
}

class User {
    private String username;
    private List<User> friends;
    private List<String> notifications;

    public User(String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    public FriendRequest sendFriendRequest(User receiver) {
        FriendRequest friendRequest = new FriendRequest(this, receiver);
        receiver.getNotifications().add("You have received a friend request from " + this.username + ".");
        return friendRequest;
    }

    public void viewNotifications() {
        for (String notification : notifications) {
            System.out.println(notification);
        }
        notifications.clear();
    }

    public void viewFriends() {
        if (friends.isEmpty()) {
            System.out.println("You have no friends yet.");
        } else {
            System.out.println("Your friends:");
            for (User friend : friends) {
                System.out.println(friend.getUsername());
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<String> getNotifications() {
        return notifications;
    }
}

public class FriendRequestDemo {
    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Alice");

        FriendRequest request = user1.sendFriendRequest(user2);
        request.accept();

        user1.viewNotifications();
        user2.viewNotifications();

        user1.viewFriends();
        user2.viewFriends();
    }
}
