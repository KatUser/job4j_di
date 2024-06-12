package ru.job4j.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bird implements Pet<Bird>{
    @Value("${bird.name:simpleBird}") /*после двоеточия добавлено значение, которое будет присвоено переменной по умолчанию.*/
    private String name;

    @Override
    public String print() {
        return "Bird name = %s".formatted(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}