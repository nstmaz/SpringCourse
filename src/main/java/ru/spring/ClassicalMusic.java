package ru.spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import ru.spring.Music;

import java.util.ArrayList;

@Component
//@Scope("prototype")
@PropertySource("musicPlayer.properties")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void springInit() {
        System.out.println("initialization");
    }

    @PreDestroy
    public void springDestroy() {
        System.out.println("destruction");
    }

    @Override
    public String getSong() {
        return "Eine kleine Nachtmusik";
    }
}
