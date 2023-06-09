public class CommunityPostRequest {
    private String postContent;

    public CommunityPostRequest(String postContent) {
        this.postContent = postContent;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public void submitPost() {
        
        System.out.println("Post submitted successfully: " + postContent);
    }
}