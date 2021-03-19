package ru.spring;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import ru.spring.Music;

import java.util.ArrayList;

@Component
@PropertySource("classpath:musicPlayer.properties")
public class ClassicalMusic implements Music {
    @Override
    public ArrayList<String> getSongs() {
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Eine kleine Nachtmusik");
        songs.add("O mio babbino caro");
        songs.add("Toccata and Fugue in D minor");
        return songs;
    }
}
