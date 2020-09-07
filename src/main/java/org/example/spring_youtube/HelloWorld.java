package org.example.spring_youtube;

public class HelloWorld implements MessageRander {

    @Override
    public String renderMessage() {
        return "Hello World!";
    }
}
