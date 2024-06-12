package ru.job4j.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*Чтобы указать Spring'у,
        в каком каталоге находятся компоненты, мы передаем ему адрес пакета в аргументах:*/
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Config.class);
        Man man = context.getBean(Man.class);
        man.print();
    }
}