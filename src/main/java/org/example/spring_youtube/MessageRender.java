package org.example.spring_youtube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("render")
public class MessageRender {
    @Autowired
    private HelloWorld messageWorld;
    @Autowired
    private HelloLanit messageLanit;
    private int ping;
    private String nameHost;
    private List<String> list;

    void renderMessage(MessageEnum music) {
        if (music != MessageEnum.WORLD) {
            System.out.println(messageLanit.getMessage());
        } else {
            System.out.println(messageWorld.getMessage());
        }
    }

}
