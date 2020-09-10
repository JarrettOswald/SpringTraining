package org.example.spring_youtube;

import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld implements Message {

    @Override
    public String getMessage() {

        return "Hello World!";
    }

    public static HelloWorld go() {
        System.out.println("Создаем объект HelloWorld");
        return new HelloWorld();
    }

    public void init() {
        System.out.println("-------------");
    }

    public void destroy() {
        System.out.println("-------------");
    }

}
