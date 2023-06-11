public class Message {
    private String sender;
    private String receiver;
    private String content;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public String getMessageSender() {
        return sender;
    }

    public String getMessageReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public void setMessageSender(String sender) {
        if (sender != null && !sender.isEmpty()) {
            this.sender = sender;
        } else {
            System.out.println("Invalid sender name.");
        }
    }

    public void setMessageReceiver(String receiver) {
        if (receiver != null && !receiver.isEmpty()) {
            this.receiver = receiver;
        } else {
            System.out.println("Invalid receiver name.");
        }
    }

    public void setContent(String content) {
        if (content != null && !content.isEmpty()) {
            this.content = content;
        } else {
            System.out.println("Invalid message content.");
        }
    }

    public void displayMessage() {
        System.out.println("From: " + sender);
        System.out.println("To: " + receiver);
        System.out.println("Content: " + content);
    }
}
