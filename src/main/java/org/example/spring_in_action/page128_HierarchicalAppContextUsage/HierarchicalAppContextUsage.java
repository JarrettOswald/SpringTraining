package org.example.spring_in_action.page128_HierarchicalAppContextUsage;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {

    public static void main(String[] args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:/HierarchicalAppContextUsagePage128/parent-context.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:/HierarchicalAppContextUsagePage128/child-context.xml");
        child.setParent(parent);
        child.refresh();

        Song song1 = child.getBean("song1",Song.class);
        System.out.println(song1.getTitle());

        Song song2 = child.getBean("song2",Song.class);
        System.out.println(song2.getTitle());

        Song song3 = child.getBean("song3",Song.class);
        System.out.println(song3.getTitle());


    }
}
