public class CommunityMember extends User {
    private String communityUsername;
    private String communityProfilePic;
    private ArrayList<String> friends;
    private ArrayList<String> blockedFriends;

    public CommunityMember(String username, String email, String communityUsername, String communityProfilePic) {
        super(username, email);
        this.communityUsername = communityUsername;
        this.communityProfilePic = communityProfilePic;
        this.friends = new ArrayList<>();
        this.blockedFriends = new ArrayList<>();
    }

    public String getCommunityUsername() {
        return communityUsername;
    }

    public void setCommunityUsername(String communityUsername) {
        this.communityUsername = communityUsername;
    }

    public String getCommunityProfilePic() {
        return communityProfilePic;
    }

    public void setCommunityProfilePic(String communityProfilePic) {
        this.communityProfilePic = communityProfilePic;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void addFriend(String username) {
        friends.add(username);
    }

    public void removeFriend(String username) {
        friends.remove(username);
    }

    public ArrayList<String> getBlockedFriends() {
        return blockedFriends;
    }

    public void blockFriend(String username) {
        blockedFriends.add(username);
    }

    public void unblockFriend(String username) {
        blockedFriends.remove(username);
    }

    public void displayCommunityMemberInfo() {
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Community Username: " + communityUsername);
        System.out.println("Community Profile Picture: " + communityProfilePic);
        System.out.println("Friends: " + friends);
        System.out.println("Blocked Friends: " + blockedFriends);
    }
}
