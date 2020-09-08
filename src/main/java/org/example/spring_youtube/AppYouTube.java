package org.example.spring_youtube;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppYouTube {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/app-context-youtube.xml");
        MessageRender messageRender = context.getBean("messageRender", MessageRender.class);
        messageRender.renderMessage();
        System.out.println(messageRender.getNameHost());
        System.out.println(messageRender.getPing());
        System.out.println(messageRender.getList());
    }
}
