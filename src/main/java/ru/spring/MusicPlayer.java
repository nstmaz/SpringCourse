package ru.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public  void PlayMusic(){
        System.out.println("playing "+music.getSong());
    }
}
