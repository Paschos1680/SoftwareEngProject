class FriendRequest:
    def __init__(self, sender, receiver):
        self.sender = sender
        self.receiver = receiver
        self.status = "pending"

    def accept(self):
        if self.status == "pending":
            self.status = "accepted"
            self.sender.friends.append(self.receiver)
            self.receiver.friends.append(self.sender)
            self.sender.notifications.append("Your friend request to {} has been accepted.".format(self.receiver.username))
            self.receiver.notifications.append("You accepted a friend request from {}.".format(self.sender.username))
        else:
            print("Friend request has already been accepted or rejected.")

    def reject(self):
        if self.status == "pending":
            self.status = "rejected"
            self.sender.notifications.append("Your friend request to {} has been rejected.".format(self.receiver.username))
            self.receiver.notifications.append("You rejected a friend request from {}.".format(self.sender.username))
        else:
            print("Friend request has already been accepted or rejected.")


class User:
    def __init__(self, username):
        self.username = username
        self.friends = []
        self.notifications = []

    def send_friend_request(self, receiver):
        friend_request = FriendRequest(self, receiver)
        receiver.notifications.append("You have received a friend request from {}.".format(self.username))
        return friend_request

    def view_notifications(self):
        for notification in self.notifications:
            print(notification)
        self.notifications = []

    def view_friends(self):
        if not self.friends:
            print("You have no friends yet.")
        else:
            print("Your friends:")
            for friend in self.friends:
                print(friend.username)