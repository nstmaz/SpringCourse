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

        Music music1 = context.getBean("classicalMusic",Music.class);
        Music music2 = context.getBean("rockMusic",Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music1);
        musicPlayer.PlayMusic();

        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.PlayMusic();

        context.close();
    }
}