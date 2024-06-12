package ru.job4j.annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru/job4j/annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    @Order(10)
    public Dog getAlfaDog() {
        return new Dog("AlfaPsina");
    }

    @Order(7)
    @Bean(name = "Second Dog")
    public Dog getDog() {
        return new Dog("Second Dog");
    }

    @Order(1)
    @Bean
    public Dog someDog() {
        return new Dog("Some Dog");
    }

}
