package org.example.spring_in_action.render;

import org.example.spring_in_action.provider.MessageProvider;

public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
