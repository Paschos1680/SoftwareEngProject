class CommunityPost:
    def __init__(self, content, visibility):
        self.content = content
        self.visibility = visibility

    def create_post(self):
        self.content = input("Enter the content of your post: ")
        self.visibility = input("Do you want your post to be visible to all users or friends only? (all/friends): ")

    def display_post(self):
        print("Post content:", self.content)
        print("Visibility:", self.visibility)

    def edit_post(self):
        choice = input("Do you want to edit your post? (yes/no): ")
        if choice.lower() == "yes":
            self.content = input("Enter the updated content of your post: ")
            print("Post has been updated.")
        else:
            print("Post remains unchanged.")

    def delete_post(self):
        choice = input("Do you want to delete your post? (yes/no): ")
        if choice.lower() == "yes":
            self.content = ""
            self.visibility = ""
            print("Post has been deleted.")
        else:
            print("Post remains unchanged.")

# Example usage:
post = CommunityPost("", "")
post.create_post()
post.display_post()
post.edit_post()
post.display_post()
post.delete_post()
post.display_post()