package org.example.spring_in_action.default_example;

import org.example.spring_in_action.default_example.config.AppConfiguration;
import org.example.spring_in_action.default_example.model.InjectSimpleSpel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("child-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        InjectSimpleSpel injectSimpleSpel = context.getBean("ISSpel", InjectSimpleSpel.class);
        System.out.println(injectSimpleSpel);
    }
}
