package org.example.spring_in_action.default_example.config;

import org.example.spring_in_action.default_example.provider.HelloWorldMessageProvider;
import org.example.spring_in_action.default_example.provider.MessageProvider;
import org.example.spring_in_action.default_example.render.MessageRenderer;
import org.example.spring_in_action.default_example.render.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
//@ImportResource(locations = {"child-context.xml"})

public class AppConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
