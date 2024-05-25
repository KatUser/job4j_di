package ru.job4j.di;

import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

/* Without Dependency Injection */
public class NoContextDI {
    public static void main(String[] args) {
        Store store = new Store();
        StartUI startUI = new StartUI(store);
        startUI.add("Busya");
        startUI.add("Myaflya");
        startUI.print();
    }
}
