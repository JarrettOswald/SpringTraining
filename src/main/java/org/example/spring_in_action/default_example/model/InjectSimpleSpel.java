package org.example.spring_in_action.default_example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ISSpel")
public class InjectSimpleSpel {

    private String name;
    @Value("#{ISConfig.age}")
    private int age;
    @Value("#{ISConfig.height}")
    private float height;
    private boolean programmer;
    private Long ageInSecond;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeInSecond() {
        return ageInSecond;
    }

    public void setAgeInSecond(Long ageInSecond) {
        this.ageInSecond = ageInSecond;
    }

    public String toString() {
        return "InjectSimpleSpel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSecond=" + ageInSecond +
                '}';
    }

}
