package ru.job4j.di.model;

/*No dependency injection*/

import org.springframework.stereotype.Component;

@Component
/* Component annotation tells Spring to add the class into context */
public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        store.getAll().forEach(System.out::println);
    }
}