package org.example.spring_youtube;

import org.springframework.stereotype.Component;

@Component("helloLanit")
public class HelloLanit implements Message {

    @Override
    public String getMessage() {
        return "Привет Ланит!";
    }
}
