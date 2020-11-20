package org.example.spring_in_action;

import org.example.spring_in_action.config.AppConfiguration;
import org.example.spring_in_action.model.InjectSimpleSpel;
import org.example.spring_in_action.provider.MessageProvider;
import org.example.spring_in_action.provider.Singer;
import org.example.spring_in_action.render.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        InjectSimpleSpel injectSimpleSpel = context.getBean("ISSpel", InjectSimpleSpel.class);
        System.out.println(injectSimpleSpel);
    }
}
