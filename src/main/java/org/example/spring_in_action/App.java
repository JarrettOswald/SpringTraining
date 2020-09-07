package org.example.spring_in_action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("/app-context.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/app-context.xml");
        MessageRenderer mr = context.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
