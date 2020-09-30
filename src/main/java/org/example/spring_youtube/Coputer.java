package org.example.spring_youtube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coputer {
    private int id;
    private MessageRender messageRender;

    @Autowired
    public Coputer(MessageRender messageRender) {
        this.id = 1;
        this.messageRender = messageRender;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + messageRender.renderMessage();
    }
}
