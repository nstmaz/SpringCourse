package ru.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.spring.config.SpringConfig;

/**
 * Hello world!
 */
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.PlayMusic());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}