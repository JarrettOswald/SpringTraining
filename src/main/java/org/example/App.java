package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getMessageRender();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
