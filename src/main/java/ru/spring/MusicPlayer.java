package ru.spring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
@Getter
@Setter
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> genres;


//    @Autowired
    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public String PlayMusic() {
        Random rnd = new Random();
        int index = rnd.nextInt(genres.size());
        return genres.get(index).getSong();
    }
}