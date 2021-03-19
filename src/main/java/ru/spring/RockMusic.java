package ru.spring;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@PropertySource("classpath:musicPlayer.properties")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Should I Stay or Should I Go";
    }
}
