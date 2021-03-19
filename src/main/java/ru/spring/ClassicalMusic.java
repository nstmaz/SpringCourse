package ru.spring;

public class ClassicalMusic implements Music{

    public void springInit() {
        System.out.println("doing my initialization");
    }

    public void springDestroy() {
        System.out.println("doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
