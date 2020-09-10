package org.example.spring_youtube;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppYouTube {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/app-context-youtube.xml");

        context.getBean("messageWorld",HelloWorld.class);
//        MessageRender messageRender = context.getBean("messageRender", MessageRender.class);
//        messageRender.renderMessage();
//        System.out.println("Хост по дефолу "+messageRender.getNameHost());
//        System.out.println("Измененный хост");
//        messageRender.setNameHost("host2");
//        MessageRender messageRender2 = context.getBean("messageRender", MessageRender.class);
//        System.out.println(messageRender2.getNameHost());
    }
}
