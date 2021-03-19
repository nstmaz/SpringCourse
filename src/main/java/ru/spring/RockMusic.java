package ru.spring;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@PropertySource("classpath:musicPlayer.properties")
public class RockMusic implements Music{
    @Override
    public ArrayList<String> getSongs() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Smoke on the Water");
        songs.add("Should I Stay or Should I Go");
        songs.add("Under Pressure");
        return songs;
    }
}
