package org.example.spring_in_action.default_example.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("singer")
public class Singer {

    @Autowired
    private Inspiration inspiration;

    public void song() {
        System.out.println(inspiration.getLyric());
    }

}
