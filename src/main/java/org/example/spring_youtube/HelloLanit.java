package org.example.spring_youtube;

public class HelloLanit implements MessageRander {
    @Override
    public String renderMessage() {
        return "Привет Ланит!";
    }
}
