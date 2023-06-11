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


