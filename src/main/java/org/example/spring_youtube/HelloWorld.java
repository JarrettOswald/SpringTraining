package org.example.spring_youtube;

import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld implements Message {

    private String[] message = new String[]{"Привет Мир", "Привет Java", "Привет всем"};

    @Override
    public String getMessage() {
        int randomCount = (int) (Math.random()*3);
        return message[randomCount];
    }

}
