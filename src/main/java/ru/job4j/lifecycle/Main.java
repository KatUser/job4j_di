package ru.job4j.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /* When creating Context we transfer the name of the
        package (in constructor) that has all the components we need */
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("ru/job4j/lifecycle");
        context.close();
    }
}
