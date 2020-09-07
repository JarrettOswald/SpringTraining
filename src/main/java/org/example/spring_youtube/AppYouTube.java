package org.example.spring_youtube;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppYouTube {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/app-context-youtube.xml");

        MessageRander messageRander = context.getBean("render", MessageRander.class);

        System.out.println(messageRander.renderMessage());

    }
}
