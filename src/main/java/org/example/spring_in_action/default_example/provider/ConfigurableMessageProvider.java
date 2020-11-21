package org.example.spring_in_action.default_example.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("providerC")
public class ConfigurableMessageProvider implements MessageProvider {

    String message;

    public ConfigurableMessageProvider(@Value("28") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
