package org.example.spring_in_action.config;

import org.example.spring_in_action.provider.HelloWorldMessageProvider;
import org.example.spring_in_action.provider.MessageProvider;
import org.example.spring_in_action.render.MessageRenderer;
import org.example.spring_in_action.render.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("org.example")
//@ImportResource(locations = {"app-context.xml"})

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
