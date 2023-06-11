import java.util.ArrayList;
import java.util.List;

public class CommunityPage {
    private List<String> posts;

    public CommunityPage() {
        posts = new ArrayList<>();
    }

    public void addPost(String post) {
        posts.add(post);
    }

    public void displayPosts(CommunityMember viewer) {
        System.out.println("Posts on the Community Page:");

        for (String post : posts) {
            System.out.println(post);
        }

        System.out.println("Viewer: " + viewer.getUsername());
    }
}
