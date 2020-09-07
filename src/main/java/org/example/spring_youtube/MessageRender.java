package org.example.spring_youtube;

public class MessageRender {
    Message message;
    int ping;
    String nameHost;

    MessageRender() {
    }

    MessageRender(Message message) {
        this.message = message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void renderMessage() {
        System.out.println("Message: " + message.getMessage());
    }

    public Message getMessage() {
        return message;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    public String getNameHost() {
        return nameHost;
    }

    public void setNameHost(String nameHost) {
        this.nameHost = nameHost;
    }
}
