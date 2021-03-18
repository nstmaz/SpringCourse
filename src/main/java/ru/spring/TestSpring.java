package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class TestSpring
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.PlayMusic();

        context.close();
    }
}
