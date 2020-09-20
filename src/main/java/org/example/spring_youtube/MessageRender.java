package org.example.spring_youtube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageRender {
    private Message message;
    private int ping;
    private String nameHost;
    private List<String> list;

    private MessageRender() {
    }

    @Autowired
    MessageRender(Message message) {
        this.message = message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String renderMessage() {
        return "Message: " + message.getMessage();
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
