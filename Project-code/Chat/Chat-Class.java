Chat Class:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chat {
    private List<String> recentConversations;
    private List<String> searchList;
    private String currentUser;

    public Chat() {
        recentConversations = new ArrayList<>();
        searchList = new ArrayList<>();
    }

    public void startChat() {
        displayRecentConversations();
        displaySearchList();
        selectUser();
        personalChatPage();
    }

    private void displayRecentConversations() {
        System.out.println("Recent Conversations:");
        for (String conversation : recentConversations) {
            System.out.println("- " + conversation);
        }
    }

    private void displaySearchList() {
        System.out.println("Search List:");
        for (String user : searchList) {
            System.out.println("- " + user);
        }
    }

    private void selectUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a user from recent conversations or search list:");
        String selectedUser = scanner.nextLine();
        currentUser = selectedUser;
    }

    private void personalChatPage() {
        System.out.println("Personal Chat with " + currentUser);
        System.out.println("1. Compose new message");
        System.out.println("2. View messages");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                composeMessage();
                break;
            case 2:
                viewMessages();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private void composeMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compose your message:");
        String message = scanner.nextLine();
        sendMessage(message);
    }

    private void sendMessage(String message) {
        System.out.println("Message sent: " + message);
        // Update personal chat page
        personalChatPage();
    }

    private void viewMessages() {
        // Display messages for the current user
        // Allow deletion or editing of messages
        // Update personal chat page
        personalChatPage();
    }

    public void addRecentConversation(String conversation) {
        recentConversations.add(conversation);
    }

    public void addSearchUser(String user) {
        searchList.add(user);
    }

    public void closeChat() {
        System.out.println("Chat closed.");
    }
}