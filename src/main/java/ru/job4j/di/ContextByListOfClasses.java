package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class ContextByListOfClasses {
    public static void main(String[] args) {
        /* Creating context */
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        /* Registering classes that are to be Beans */
        context.register(Store.class, StartUI.class);
        /* Refresing the context */
        context.refresh();
        /* Getting new Bean and using it */
        StartUI startUI = context.getBean(StartUI.class);
        startUI.add("String1");
        startUI.add("String2");
    }
}
