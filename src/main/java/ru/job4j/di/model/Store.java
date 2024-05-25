package ru.job4j.di.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/*No dependency injection*/

@Component
/* Component annotation tells Spring to add the class into context */

public class Store {
    private List<String> data = new ArrayList<>();

    public void add(String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}