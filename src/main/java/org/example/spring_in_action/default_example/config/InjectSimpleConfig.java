package org.example.spring_in_action.default_example.config;

import org.springframework.stereotype.Component;

@Component("ISConfig")
public class InjectSimpleConfig {

    private String name = "John Mayer";
    private int age = 27;
    private float height = 1.98f;
    private boolean programmer = false;
    private Long ageInSecond = 1_241_401_123L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSecond() {
        return ageInSecond;
    }
}
