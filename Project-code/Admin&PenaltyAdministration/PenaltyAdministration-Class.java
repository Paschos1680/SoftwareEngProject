import java.util.ArrayList;
import java.util.List;

public class PenaltyAdministration {
    private String content;
    private String postAuthor;
    private int offensivePostsCount;
    private int strikeCount;
    private int blockCount;
    private boolean permanentBan;
    private int suspensionDays;
    private int banDuration;
    private String userHistory;
    private List<String> penalties;

    public PenaltyAdministration() {
        penalties = new ArrayList<>();
    }

    public void deleteOffensivePost(String content) {
        System.out.println("Deleting offensive post with content: " + content);
        
    }

    public void giveWarning(String author) {
        System.out.println("Giving a warning to the author: " + author);
       
    }

    public void suspendPosting(int banDuration) {
        System.out.println("Suspending posting for " + banDuration + " days");
        
    }

    public void banUser(String author) {
        System.out.println("Banning the user: " + author);
        
    }

    public void deleteAccount(String author) {
        System.out.println("Deleting the account of the user: " + author);
        
    }

    public void removePostFromCommunity(CommunityPage post) {
        System.out.println("Removing post from the community");
        
    }

    public String getOffensivePosts(String userHistory) {
        System.out.println("Retrieving offensive posts from user's history");
        return null; 
    }

    public int getStrikeCount(int strikeCount) {
        System.out.println("Retrieving strike count: " + strikeCount);
        return 0; 
    }

    public int getBlockCount(int blockCount) {
        System.out.println("Retrieving block count: " + blockCount);
        return 0; 
    }

    public boolean hasPermanentBan() {
        System.out.println("Checking if the user has a permanent ban");
        return permanentBan;
    }

    public void addPenalty(String penalty) {
        penalties.add(penalty);
    }

    public List<String> getPenalties() {
        return penalties;
    }
}
