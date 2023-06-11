import java.util.Scanner;

class CommunityPost {
    private String content;
    private String visibility;

    public CommunityPost(String content, String visibility) {
        this.content = content;
        this.visibility = visibility;
    }

    public void createPost() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the content of your post: ");
        this.content = scanner.nextLine();

        System.out.print("Do you want your post to be visible to all users or friends only? (all/friends): ");
        this.visibility = scanner.nextLine();
    }

    public void displayPost() {
        System.out.println("Post content: " + content);
        System.out.println("Visibility: " + visibility);
    }

    public void editPost() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to edit your post? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the updated content of your post: ");
            this.content = scanner.nextLine();
            System.out.println("Post has been updated.");
        } else {
            System.out.println("Post remains unchanged.");
        }
    }

    public void deletePost() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to delete your post? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            this.content = "";
            this.visibility = "";
            System.out.println("Post has been deleted.");
        } else {
            System.out.println("Post remains unchanged.");
        }
    }
}

