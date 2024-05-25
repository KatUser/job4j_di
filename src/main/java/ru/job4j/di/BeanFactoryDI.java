package ru.job4j.di;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class BeanFactoryDI {
    public static void main(String[] args) {
        /* Creating bean factory */
        DefaultListableBeanFactory defaultListableBeanFactory
                = new DefaultListableBeanFactory();
        /* Getting metadata of each bean, using their code*/
        BeanDefinition storeDefinition
                = BeanDefinitionBuilder.rootBeanDefinition(Store.class)
                .getBeanDefinition();
        BeanDefinition startUIDefinition
                = BeanDefinitionBuilder.rootBeanDefinition(StartUI.class)
                .getBeanDefinition();
        /* Transferring beans' metadata into the Bean Factory */
        defaultListableBeanFactory.registerBeanDefinition(
                "store", storeDefinition
        );
        defaultListableBeanFactory.registerBeanDefinition(
                "startUI", startUIDefinition
        );
        /*The Bean factory creates a necessary bean that we can use */
        StartUI startUI = defaultListableBeanFactory.createBean(StartUI.class);
        startUI.add("Cat");
        startUI.add("Dog");
        startUI.print();

    }
}
