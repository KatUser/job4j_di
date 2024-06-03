package lifecycle.config;

import lifecycle.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* @Configuration =  содержится конфигурационная информация в файле */
@Configuration
public class Config {
    /* @Bean указывает на то, что метод getProduct() вернет бин
    c именем myProduct .*/
    /* Свойства initMethod = "initMethod",  destroyMethod = "destroyMethod"  указывают фреймворку,
    какие методы применить при инициализации бина и перед уничтожением бина. */
    @Bean(name = "myProduct",
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    public Product getProduct() {
        return new Product("Good product", 2.5);
    }
}
