package ru.spring.genres;

import org.springframework.stereotype.Component;
import ru.spring.Music;

//@Component
public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "All Blues";
    }
}
