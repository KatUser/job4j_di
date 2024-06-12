package ru.job4j.annotation;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.List;

@Component
public class Man {

    @Autowired
    private Set<Pet> pets;

    @Autowired
    private List<Pet<Dog>> dogs;

    @Autowired
    private Map<String, Pet> mapDogs;


    /* Autowired - Внедрение непосредственно в поле:
    * нельзя объявить final */
    @Autowired
    private Dog dog;

    @Resource(name = "someDog")
    private Dog dog1;

    @Autowired
    @Qualifier("Second Dog")
    private Dog dog2;

    private Bird bird;

    private Cat cat;

    /* Внедрение через конструктор:
    * наиболее рекомендуемый способ внедрения.
    * Можно создавать неизменяемые объекты, простой процесс тестирования */
    @Autowired
    public Man(Cat cat) {
        this.cat = cat;
    }

    /* Внедрение с помощью метода:
    * нельзя создать неизменяемый объект.*/
    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    public void print() {
        /* System.out.printf("My Dog: %s%n", dog.print());
        System.out.printf("My SecondDog: %s%n", dog1.print());
        System.out.printf("My Cat: %s%n", cat.print());
        System.out.printf("My Bird: %s%n", bird.print());
         */

        System.out.println("pets:");
        pets.forEach(s -> System.out.println(s.print()));
        System.out.println("dogs:");
        dogs.forEach(s -> System.out.println(s.print()));
        System.out.println("mapDogs:");
        mapDogs.forEach((key, value) -> System.out.printf("%s - %s%n", key, value.print()));
    }

    public void setDog(Dog dog) {
        this.dog = dog;

    }

    public void setDog1(Dog dog1) {
        this.dog1 = dog1;
    }

    public void setDogs(List dogs) {
        this.dogs = dogs;
    }

    public void setPets(Set pets) {
        this.pets = pets;
    }

    public void setMapDogs(Map mapDogs) {
        this.mapDogs = mapDogs;
    }
}
