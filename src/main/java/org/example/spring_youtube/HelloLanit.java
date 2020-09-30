package org.example.spring_youtube;

import org.springframework.stereotype.Component;

@Component("helloLanit")
public class HelloLanit implements Message {

    String[] message = new String[]{"Привет Ланит", "Привет технологии", "Привет экспертиза"};

    @Override
    public String getMessage() {
        int randomCount = (int) (Math.random() * 3);
        return message[randomCount];
    }
}
