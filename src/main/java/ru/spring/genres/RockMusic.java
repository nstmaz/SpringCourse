package ru.spring.genres;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import ru.spring.Music;

import java.util.ArrayList;

//@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Should I Stay or Should I Go";
    }
}
