package org.example.spring_youtube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("render")
public class MessageRender {
    @Autowired
    private HelloWorld messageWorld;

    @Autowired
    private HelloLanit messageLanit;

    @Value("Пинг")
    private String ping;

    @Value("Жопа бобра")
    private String host;

    void renderMessage(MessageEnum music) {
        if (music != MessageEnum.WORLD) {
            System.out.println(messageLanit.getMessage());
        } else {
            System.out.println(messageWorld.getMessage());
        }
    }


}
