public class RecentChats {
    private List<String> recentChats;

    public RecentChats() {
        recentChats = new ArrayList<>();
    }

    public void addChat(String chat) {
        recentChats.add(chat);
    }

    public void removeChat(int index) {
        if (index >= 0 && index < recentChats.size()) {
            recentChats.remove(index);
        } else {
            System.out.println("Eror! Cant Remove Chat.");
        }
    }

    public String getRecentChats() {
        StringBuilder sb = new StringBuilder();
        for (String chat : recentChats) {
            sb.append(chat).append("\n");
        }
        return sb.toString();
    }

    public String displayRecentChats() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recent Chats:\n");
        for (int i = 0; i < recentChats.size(); i++) {
            sb.append(i + 1).append(". ").append(recentChats.get(i)).append("\n");
        }
        return sb.toString();
    }

    public void editChat(int index, String newContent) {
        if (index >= 0 && index < recentChats.size()) {
            recentChats.set(index, newContent);
        } else {
            System.out.println("Eror. Cnan't edit Chat!. ");
        }
    }
}
