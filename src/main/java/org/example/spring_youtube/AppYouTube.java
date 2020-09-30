package org.example.spring_youtube;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppYouTube {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context-youtube.xml");
        MessageRender messageRender = context.getBean("render", MessageRender.class);
        messageRender.renderMessage(MessageEnum.LANIT);
        context.close();
    }
}
