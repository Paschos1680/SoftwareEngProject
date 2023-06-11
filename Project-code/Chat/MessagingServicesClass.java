import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingService {
    private Map<String, List<Message>> userMessages;

    public MessagingService() {
        userMessages = new HashMap<>();
    }

    public void sendMessage(String sender, String receiver, String content) {
        Message message = new Message(sender, receiver, content);
        List<Message> messages = userMessages.getOrDefault(receiver, new ArrayList<>());
        messages.add(message);
        userMessages.put(receiver, messages);
    }

    public List<Message> getMessagesForUser(String username) {
        return userMessages.getOrDefault(username, new ArrayList<>());
    }

    public void editMessage(Message message, String newContent) {
        if (message != null) {
            message.setContent(newContent);
        }
    }
}
