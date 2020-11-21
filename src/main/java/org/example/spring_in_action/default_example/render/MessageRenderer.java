package org.example.spring_in_action.default_example.render;

import org.example.spring_in_action.default_example.provider.MessageProvider;

public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
