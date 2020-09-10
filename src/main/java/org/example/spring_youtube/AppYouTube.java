package org.example.spring_youtube;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppYouTube {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context-youtube.xml");

        Message messageL = context.getBean("helloLanit", Message.class);
        Message messageW = context.getBean("helloWorld", Message.class);

        MessageRender messageRender2 = new MessageRender(messageW);
        MessageRender messageRender = new MessageRender(messageL);

        messageRender.renderMessage();
        messageRender2.renderMessage();

    }
}
