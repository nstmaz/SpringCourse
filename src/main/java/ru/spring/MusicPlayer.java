package ru.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;


    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public String PlayMusic(Genres genre) {
        ArrayList songs = new ArrayList<String>();
        if (genre == Genres.CLASSICAL)
            songs = classicalMusic.getSongs();
        else
            songs = rockMusic.getSongs();

        Random rnd = new Random();
        int index = rnd.nextInt(3);
        return "playing " + songs.get(index);
    }
}