package org.example.spring_youtube;

public class MessageRender {
    Message message;

    MessageRender(Message message) {
        this.message = message;
    }

    public void renderMessage() {
        System.out.println("Message: " + message.getMessage());
    }
}
