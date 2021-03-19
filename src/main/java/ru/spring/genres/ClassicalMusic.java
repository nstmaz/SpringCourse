package ru.spring.genres;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import ru.spring.Music;

import java.util.ArrayList;

//@Component("classicalMusic")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Eine kleine Nachtmusik";
    }
}
