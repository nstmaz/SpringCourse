package ru.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public  void PlayMusic(){
        System.out.println(music.getSong());

    }
}
