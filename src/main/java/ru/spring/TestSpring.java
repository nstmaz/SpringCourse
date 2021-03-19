package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic music1 = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(music1.getSong());

//        Music music = context.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getMusic().getSong());

        context.close();
    }
}
