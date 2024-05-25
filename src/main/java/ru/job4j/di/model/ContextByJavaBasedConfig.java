package ru.job4j.di.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        /* Creating context and transfer the package address with the classes to be put into context */
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("ru.job4j.di.model");
        StartUI startUI = context.getBean(StartUI.class);
        Store store = context.getBean(Store.class);
        startUI.add("Cat");
        startUI.add("Dog");
    }
}
